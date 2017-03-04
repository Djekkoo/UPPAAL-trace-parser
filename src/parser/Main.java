package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import myTrace.Trace;
import parser.antlr4.UPPAALTraceLexer;
import parser.antlr4.UPPAALTraceParser;
import parser.antlr4.UPPAALTraceParser.TraceContext;
import uppaal.NTA;
import uppaal.UppaalPackage;

public class Main {

	// refers to the executable of the trace tool of libutap.
	//public final static String LIBUTAP_TRACER_091 = "tracer91"; //unused until a libtap fix is found
	//public final static String LIBUTAP_TRACER_093 = "tracer93"; //unused until a libtap fix is found
	

	protected static final File testfileCora = new File("./testfiles/human_traces/EnterRoom-gui-generated-some.human"); // cora with libutap 0.91
	protected static final File testfileNoCora = new File("./testfiles/human_traces/EnterRoom-Geen-Cora_trace_fastest.human"); // nocora with libutap 0.93
	protected static final File testfileVerifyta = new File("./testfiles/human_traces/EnterRoom-nocora_new_shortest.human");   // CORA verifyta output
	protected static final File testSmallECHO = new File("/home/jacco/bachref/examples/ECHO/ECHO_small.xtr_human"); // large
	protected static final File IPTV = new File("/home/jacco/bachref/examples/ADTool_IPTV/6_UPPAAL_result_trace_small.txt");
	
	// please provide manual 
	public static final URI UPPAAL_ECORE = URI.createFileURI("/home/jacco/workspace/test-EMF/uppaal.ecore");
	public static final URI MY_TRACE_ECORE = URI.createFileURI("/home/jacco/workspace/test-EMF/myTrace.ecore");;
	

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
		
		/*if (args.length < 3) {
			System.out.format("Please use as java -jar %s <model.xml> <trace.xtr>%n", new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getName());
			return;
		}*/
		String model = "/home/jacco/bachref/examples/AttackTrees/UPPAAL/EnterRoom.xml";
		File trace = new File("/home/jacco/bachref/examples/exampleSDF_UPPAAL_Trace.txt");//AttackTrees/UPPAAL/EnterRoom-cora-default-old.human");

		// parse
		new Main(trace, model);
		
	}
	public Main(File iptv, String model) throws IOException {
		TraceContext ctx = this.getTraceContext(iptv);
		
		NTA uppaal = (NTA) Main.loadResource(model);
		
		Trace trace = this.parseTraceContext(ctx, uppaal);
		System.out.println("Found " + trace.getStates().size() + " states");

		URI file = URI.createFileURI("/home/jacco/bachref/parser/intermediate.model");
		boolean success = this.saveResource(trace, file);
		if (!success)
			System.out.println("Could not save resource!");
		else
			System.out.println("Saved resource as: " + file.path());
	}
	
	public Trace parseTraceContext(TraceContext ctx, NTA uppaal) {
		if (ctx == null) {
			System.out.println("Could not parse trace, TraceContext is null");
			return null;
		}
		
		long startTime = System.currentTimeMillis();
		
		// parse
		GenericParser parser = new GenericParser(uppaal);
		ctx.accept(parser);
		Trace res = parser.buildTrace();
		System.out.println("Parsed in " + String.valueOf(((float)(System.currentTimeMillis() - startTime))/1000) + " seconds");
		
		return res;
	}
	
	
	public TraceContext getTraceContext(File traceFile) throws FileNotFoundException {
		System.out.println("Loading file: " + traceFile.getAbsolutePath());
		CharStream stream = new UnbufferedCharStream(new FileInputStream(traceFile));
		
		long startTime = System.currentTimeMillis();
		TraceContext res = parseProgram(stream);
		
		System.out.println("Recognized in " + String.valueOf(((float)(System.currentTimeMillis() - startTime))/1000) + " seconds");
		return res;
	}
	
	// parse charstream
	protected TraceContext parseProgram(CharStream stream) {
		UPPAALTraceLexer lexer = new UPPAALTraceLexer(stream);
		lexer.setTokenFactory(new CommonTokenFactory(true));
		Main.ErrorListener listener = new Main.ErrorListener();
		lexer.addErrorListener(listener);
		TokenStream tokens = new UnbufferedTokenStream<Token>(lexer);
		UPPAALTraceParser parser = new UPPAALTraceParser(tokens);
		//parser.setBuildParseTree(false); // or big files will not work
		
		parser.addErrorListener(listener);
		TraceContext program = parser.trace();
		return listener.error ? null : program;
	}
	
	protected static EFactory getFactory(EPackage pack) {
		return pack.getEFactoryInstance();
	}
	
	public static EObject loadResource(String filepath) throws IOException {
		
		// load
		ResourceSet rs = new ResourceSetImpl();
		
		// set ECORE
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
//		Resource resEcore = rs.createResource(UPPAAL_ECORE);
//		resEcore.load(null);
		EPackage pack = uppaal.UppaalPackage.eINSTANCE;//resEcore.getContents().get(0);
		EFactory fact = getFactory(pack);
		if (fact != null) pack.setEFactoryInstance(fact);
		rs.getPackageRegistry().put(pack.getNsURI(), pack);
		
		List<EPackage> packages = pack.getESubpackages();
		for (int i = 0; i < packages.size(); i++) {
			fact = getFactory(packages.get(i));
			if (fact != null) packages.get(i).setEFactoryInstance(fact);
			rs.getPackageRegistry().put(packages.get(i).getNsURI(), packages.get(i));
			
			if (packages.get(i).getESubpackages().size() > 0) {
				List<EPackage> packages2 = packages.get(i).getESubpackages(); 
				for (int j = 0; j < packages2.size(); j++) {
					fact = getFactory(packages2.get(j));
					if (fact != null) packages2.get(j).setEFactoryInstance(fact);
					rs.getPackageRegistry().put(packages2.get(j).getNsURI(), packages2.get(j));
				}
			}
		}
		
		// load file
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl()
		);
		
		URI file = URI.createFileURI(new File(filepath).getAbsolutePath());
		//Resource resource = rs.createResource(file);
		Resource resource = rs.getResource(file, true);
		
		UppaalPackage.eINSTANCE.getClass();
		
		for (int i = 0; i < resource.getContents().size(); i++) {
			EObject loaded = resource.getContents().get(i);
			if(loaded.eClass().getName().equals("NTA"))
				return loaded;
		}
		
		System.out.println("Loaded model is not of type UPPAAL, cannot continue.");
		System.exit(1);
		return null; // required after an System.exit(int), because of compiler errors
	}

	public boolean saveResource(Trace trace, URI modelFile) {
		try {
			// I dont necessarily know if this part of the code is doing anything, 
			// I just don't want to risk removing it. 
			ResourceSet rs = new ResourceSetImpl(); 
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
			Resource res = rs.createResource(Main.MY_TRACE_ECORE);
			res.load(null);
			EPackage metapackage = (EPackage)res.getContents().get(0);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(modelFile);
			
			// add & save
			resource.getContents().add(trace);
			resource.save(Collections.EMPTY_MAP);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private static class ErrorListener extends BaseErrorListener {
		private boolean error = false;
		
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
			error = true;
		}
	}

	
}
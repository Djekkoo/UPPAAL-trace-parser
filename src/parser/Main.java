package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
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

import parser.antlr4.UPPAALTraceLexer;
import parser.antlr4.UPPAALTraceParser;
import parser.antlr4.UPPAALTraceParser.TraceContext;
import uppaal.NTA;
import uppaal.UppaalPackage;
import uppaal.declarations.global.impl.GlobalFactoryImpl;
import uppaal.declarations.impl.DeclarationsFactoryImpl;
import uppaal.declarations.system.impl.SystemFactoryImpl;
import uppaal.expressions.ExpressionsPackage;
import uppaal.expressions.impl.ExpressionsFactoryImpl;
import uppaal.impl.UppaalFactoryImpl;
import uppaal.statements.impl.StatementsFactoryImpl;
import uppaal.templates.impl.TemplatesFactoryImpl;
import uppaal.types.core.impl.CoreFactoryImpl;
import uppaal.types.impl.TypesFactoryImpl;
import uppaal.visuals.impl.VisualsFactoryImpl;

public class Main {

	// refers to the executable of the trace tool of libutap.
	public final static String LIBUTAP_TRACER_091 = "tracer91"; //unused until a libtap fix is found
	public final static String LIBUTAP_TRACER_093 = "tracer93"; //unused until a libtap fix is found
	// please provide manual 
	public final static URI UPPAAL_ECORE = URI.createFileURI("/home/jacco/workspace/test-EMF/MyUppaal.ecore");
	
	public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
		
		/*if (args.length < 3) {
			System.out.format("Please use as java -jar %s <model.if> <trace.xtr>%n", new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getName());
			return;
		}*/

		// load resource
		NTA uppaal = (NTA) Main.loadResource("/home/jacco/bachref/examples/small_AT/3.xml");//ADTool_IPTV/3_UPPAAL_MetaModel_instance.xml");
		
		// grab a trace file
		File testfileCora = new File("./testfiles/human_traces/EnterRoom-gui-generated-some.human"); // cora with libutap 0.91
		File testfileNoCora = new File("./testfiles/human_traces/EnterRoom-Geen-Cora_trace_fastest.human"); // nocora with libutap 0.93
		File testfileVerifyta = new File("./testfiles/human_traces/EnterRoom-nocora_new_shortest.human");   // CORA verifyta output
		File testLargeECHO = new File("/home/jacco/bachref/examples/ECHO/ECHO_small.xtr_human"); // large
		File IPTV = new File("/home/jacco/bachref/examples/ADTool_IPTV/6_UPPAAL_result_trace.txt");
		CharStream stream = new UnbufferedCharStream(new FileInputStream(IPTV));
		
		// measure time
		long startTime = System.currentTimeMillis();
		
		// create AST
		TraceContext res = parseProgram(stream);
		System.out.println("Recognized in " + String.valueOf(((float)(System.currentTimeMillis() - startTime))/1000) + " seconds");

		// create parser
		GenericParser parser = new GenericParser(uppaal);
		
		//measure
		startTime = System.currentTimeMillis();
		
		// parse
		res.accept(parser);
		System.out.println("Walked in " + String.valueOf(((float)(System.currentTimeMillis() - startTime))/1000) + " seconds");
		
		// result?
		if (parser.states != null) {
			@SuppressWarnings("unused")
			Object inspectMe = parser.states.toArray();
			System.out.println("Program parsed!");
			System.out.println("number of states " + String.valueOf(parser.states.size()));
		}
		
		System.out.println("Working project set-up!");
		return;
	}
	
	// parse charstream
	public static TraceContext parseProgram(CharStream stream) {
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
		//if (false || true) return null;
		switch(pack.getNsURI()) {
			case "http://www.muml.org/uppaal/1.0.0":
				return new UppaalFactoryImpl();
			case "http://www.muml.org/uppaal/types/1.0.0":
				return new TypesFactoryImpl();
			case "http://www.muml.org/uppaal/core/1.0.0":
				return new CoreFactoryImpl();
			case "http://www.muml.org/uppaal/declarations/1.0.0":
				return new DeclarationsFactoryImpl();
			case "http://www.muml.org/uppaal/declarations/global/1.0.0":
				return new GlobalFactoryImpl();
			case "http://www.muml.org/uppaal/declarations/system/1.0.0":
				return new SystemFactoryImpl();
			case "http://www.muml.org/uppaal/templates/1.0.0":
				return new TemplatesFactoryImpl();
			case "http://www.muml.org/uppaal/statements/1.0.0":
				return new StatementsFactoryImpl();
			case "http://www.muml.org/uppaal/expressions/1.0.0":
				return new ExpressionsFactoryImpl();
			case "http://www.muml.org/uppaal/visuals/1.0.0":
				return new VisualsFactoryImpl();
		}
		
		System.out.println("Something went possibly wrong, could not create factory for NSUri: " + pack.getNsURI());
		return null; 
	}
	
	public static EObject loadResource(String filepath) throws IOException {
		
		// load
		ResourceSet rs = new ResourceSetImpl();
		
		// set ECORE
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource resEcore = rs.createResource(UPPAAL_ECORE);
		resEcore.load(null);
		EPackage pack = (EPackage) resEcore.getContents().get(0);
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

	
	private static class ErrorListener extends BaseErrorListener {
		private boolean error = false;
		
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
			error = true;
		}
	}
	
	/** TEMP SAVE 
	 * 
try {
	if((int)ExpressionsPackage.class.getDeclaredField(eClass.getName().replaceAll("([A-Z])",  "_$1").substring(1).toUpperCase()).get(int.class) > 0) {
		return (EObject)ExpressionsFactoryImpl.class.getMethod("create"+eClass.getName()).invoke(this);
	}
} catch (Exception e) {
}
throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	 */

	
}
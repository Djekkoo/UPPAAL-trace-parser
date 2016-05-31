package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

import org.antlr.v4.runtime.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import myTrace.TemplateInstance;
import parser.antlr4.UPPAALTraceLexer;
import parser.antlr4.UPPAALTraceParser;
import parser.antlr4.UPPAALTraceParser.TraceContext;
import test.MetaFactory;
import uppaal.NTA;
import uppaal.declarations.system.InstantiationList;
import uppaal.templates.AbstractTemplate;
import parser.GenericParser;

public class Main {

	// refers to the executable of the trace tool of libutap.
	public final static String LIBUTAP_TRACER_091 = "tracer91"; //unused until a libtap fix is found
	public final static String LIBUTAP_TRACER_093 = "tracer93"; //unused until a libtap fix is found
	// please provide manual 

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
		
		/*if (args.length < 3) {
			System.out.format("Please use as java -jar %s <model.if> <trace.xtr>%n", new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getName());
			return;
		}*/

		// load resource
		NTA uppaal = Main.loadResource("./test.uppaal");
		
		// grab a trace file
		File testfileCora = new File("./testfiles/human_traces/EnterRoom-gui-generated-some.human"); // cora with libutap 0.91
		File testfileNoCora = new File("./testfiles/human_traces/EnterRoom-Geen-Cora_trace_fastest.human"); // nocora with libutap 0.93
		File testfileVerifyta = new File("./testfiles/human_traces/EnterRoom-nocora_new_shortest.human");   // CORA verifyta output
		File testLargeECHO = new File("/home/jacco/bachref/examples/ECHO/ECHO_small.xtr_human"); // large
		CharStream stream = new UnbufferedCharStream(new FileInputStream(testLargeECHO));
		
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
	
	public static NTA loadResource(String filepath) {
		
		// load
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl()
		);
		
		URI file = URI.createFileURI(new File(filepath).getAbsolutePath());
		//Resource resource = rs.createResource(file);
		Resource resource = rs.getResource(file, true);
		
		EObject loaded = resource.getContents().get(0);
		
		if (loaded instanceof uppaal.NTA) {
			
			return (NTA) loaded;
			
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

}
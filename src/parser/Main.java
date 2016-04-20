package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;

import parser.antlr4.UPPAALTraceLexer;
import parser.antlr4.UPPAALTraceParser;
import parser.antlr4.UPPAALTraceParser.TraceContext;
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
		// testing with test-file
		File testfileCora = new File("./testfiles/human_traces/EnterRoom-gui-generated-some.human"); // cora with libutap 0.91
		File testfileNoCora = new File("./testfiles/human_traces/EnterRoom-Geen-Cora_trace_fastest.human"); // nocora with libutap 0.93
		File testfileVerifyta = new File("./testfiles/human_traces/EnterRoom-nocora_new_shortest.human");   // CORA verifyta output
		CharStream stream = new ANTLRInputStream(new FileReader(testfileNoCora));
		
		TraceContext res = parseProgram(stream);
		GenericParser parser = new GenericParser();
		res.accept(parser);
		
		
		if (parser.states != null) {
			Object inspectMe = parser.states.toArray();
			System.out.println("Program parsed!");
		}
		
		System.out.println("Working project set-up!");
		return;
	}
	
	// parse charstream
	public static TraceContext parseProgram(CharStream stream) {
		UPPAALTraceLexer lexer = new UPPAALTraceLexer(stream);
		Main.ErrorListener listener = new Main.ErrorListener();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		UPPAALTraceParser parser = new UPPAALTraceParser(tokens);
		parser.addErrorListener(listener);
		TraceContext program = parser.trace();
		return listener.error ? null : program;
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
package parser;

import java.io.File;
import java.net.URISyntaxException;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;

import parser.antlr4.target.CoraLexer;
import parser.antlr4.target.CoraParser;
import parser.antlr4.target.CoraParser.TraceContext;

public class Main {

	// refers to the executable of the trace tool of libutap.
	public final static String LIBUTAP_TRACER_091 = "tracer91";
	public final static String LIBUTAP_TRACER_093 = "tracer93"; 	 

	public static void main(String[] args) throws URISyntaxException {
		
		if (args.length < 3) {
			System.out.format("Please use as java -jar %s <model.if> <trace.xtr>%n", new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getName());
			return;
		}
		
		
		
		System.out.println("Working project set-up!");
		return;
	}
	

	public static TraceContext parseProgram(CharStream stream) {
		CoraLexer lexer = new CoraLexer(stream);
		Main.ErrorListener listener = new Main.ErrorListener();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		CoraParser parser = new CoraParser(tokens);
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

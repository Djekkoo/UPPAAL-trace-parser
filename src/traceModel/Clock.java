package traceModel;

// represents a clock constraint
// Grammar: clockLHS relation REAL
public class Clock {
	
	private Relation relation;
	private float value;
	private LHS LHS; //TODO: defer type
	
	/** Java things */
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public Relation getRelation() {
		return relation;
	}
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	public Object getLHS() {
		return LHS;
	}
	public void setLHS(LHS LHS) {
		this.LHS = LHS;
	}
	
	// variable 	 == null indicates grammar ClockLHS = T(0) MINUS OBJECTREF; thus is in most cases useless
	// variableMinus == null indicates grammar ClockLHS = OBJECTREF MINUS T(0) | OBJECTREF
	// variableMinus != null indicates grammar ClockLHS = OBJECTREF MINUS OBJECTREF
	public class LHS { // immutable after initalisation
		private final String variable; 
		private final String variableMinus;
		
		public LHS(String variable) {
			this.variable = variable;
			this.variableMinus = null;
		}
		
		public LHS(String variable, String variableMinus) {
			this.variable = variable;
			this.variableMinus = variableMinus;
		}
		
		public String getVariable() {
			return this.variable;
		}
		
		public String getVarableMinus() {
			return this.variableMinus;
		}
		
		// ClockLHS = T(0) MINUS OBJECTREF
		public boolean isZeroMinusObject() {
			return this.variable == null;
		}
		// ClockLHS = OBJECTREF MINUS T(0) | OBJECTREF
		public boolean isObjectMinusZero() {
			return this.variable != null && this.variableMinus == null;
		}
		// OBJECTREF MINUS OBJECTREF
		public boolean isObjectMinusObject() {
			return this.variableMinus != null;
		}
		
	}

	// specific relation
	public enum Relation {
		EQ, NE, LT, LE, GT, GE;

		// maps grammar output to Relatiosn:
		// =  : EQ  | != : NE
		// <  : LT  | >  : GT
		// <= : LE  | >= : GE
		// Grammar: relation: EQ | LT | LE | GT | GE | NE; tokens defined in GrammarVocab.g4
		public static Relation getByText(String s) {
			switch (s) {
			case "=" : return Relation.EQ;
			case "==": return Relation.EQ; //verifyta
			case "!=": return Relation.NE;
			case "<" : return Relation.LT;
			case "<=": return Relation.LE;
			case ">" : return Relation.GT;
			case ">=": return Relation.GE;
			}
			return null;
		}
		
	}
}

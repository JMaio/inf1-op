package week8.logic;

public class NotWff extends Wff {

    private Wff wff;
    private Operator op;

    public NotWff(Wff wff) {
        this.wff = wff;
        this.op = Operator.NEG;
    }

    public boolean eval(Valuation val) {
        return !(wff.eval(val));
    }

    public String toString() {
        return ("" + op + wff);
    }
}
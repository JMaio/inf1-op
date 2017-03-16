package week8.logic;

public class IfWff extends BinaryWff {

    private Wff left;
    private Wff right;
    private Operator op;

    public IfWff(Wff left, Wff right) {
        super(left, right);
        super.setOp(Operator.IF);
    }

    public boolean eval(Valuation val) {
        return !getLeft().eval(val) || getRight().eval(val);
    }

}
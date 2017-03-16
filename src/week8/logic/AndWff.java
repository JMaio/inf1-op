package week8.logic;

public class AndWff extends BinaryWff {

    private Wff left;
    private Wff right;
    private Operator op;

    public AndWff(Wff left, Wff right) {
        super(left, right);
        super.setOp(Operator.AND);
    }

    public boolean eval(Valuation val) {
        return getLeft().eval(val) && getRight().eval(val);
    }

}
package week8.logic;

public class PropVar extends Wff{

    private String propVar;

    public boolean eval(Valuation val) {
        return val.get(this);
    }

    public PropVar(String str) {
        this.propVar = str;
    }

    public String toString() {
        return propVar;
    }

}
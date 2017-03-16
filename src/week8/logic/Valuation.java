package week8.logic;

import java.util.HashMap;

public class Valuation {

    private HashMap<PropVar, Boolean> val = new HashMap<>();

    public boolean get(PropVar propVar) {
        return val.get(propVar);
    }

    public void put(PropVar propVar, boolean tv) {
        val.put(propVar, tv);
    }
}
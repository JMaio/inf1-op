package week7;

import stdlib.In;

public class Tokenizer {

	private String[] mTokens = {};
	
	public Tokenizer() {}
	
	public Tokenizer(String fname) {
		tokensFromFile(fname);
	}

	public void tokensFromFile(String fname) {
		In file = new In(fname);
		String str = file.readAll();
		tokenize(str);
	}
	
	public void tokenize(String str) {
		mTokens = str.split("\\W+");
	}
	
	public String[] getTokens() {
		return mTokens;
	}
	
	public int getNumberTokens() {
		return mTokens.length;
	}
}

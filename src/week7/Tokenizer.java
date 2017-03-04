package week7;

import stdlib.In;

public class Tokenizer {

	String[] mTokens;
	
	public Tokenizer() {
		mTokens = {};
	}
	
	public Tokenizer(String fname) {
		tokensFromFile(fname);
	}

	public void tokensFromFile(String fname) {
		In file = new In(fname);
		mTokens = file.readAll().split(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

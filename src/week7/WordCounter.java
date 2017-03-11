package week7;

import java.util.HashMap;

public class WordCounter {
	
	String[] mTokens;
	private HashMap<Integer, Integer> mFreqDist = new HashMap<Integer, Integer>();
	
	public WordCounter(String[] tokens) {
		mTokens = tokens;
		wordLengthFreq(tokens);
	}
	
	public void wordLengthFreq(String[] tokens) {
		mFreqDist.clear();
		for (String word : tokens) {
			int l = word.length();
			if (mFreqDist.containsKey(l)) {
				int c = mFreqDist.get(l);
				mFreqDist.put(l, c + 1);
			} else {
				mFreqDist.put(l, 1);
			}
		}
	}
	
	public HashMap<Integer, Integer> getFreqDist() {
		return mFreqDist;
	}
	
	public int maxVal() {
		int max = 0;
		for (int n : mFreqDist.values()) {
			if (n > max) {
				max = n;
			}
		}
		return max;
	}
	
	public double[] map2array() {
		double[] norm = {};
		int elements = 0;
		if (mTokens.length > 0) {
			for (int k : mFreqDist.keySet()) {
				if (k > elements) {
					elements = k;
				}
			}
			norm = new double[elements + 1];
			int rel = maxVal();
			for (int i = 0; i <= elements; i++) {
				if (mFreqDist.containsKey(i)) {
					norm[i] = mFreqDist.get(i) * 100.0 / rel;
				} else {
					norm[i] = 0;
				}
			}
		}
		return norm;
	}

	public static void main(String[] args) {
		String[] t1 = {"hello", "hi", "there", "me", "is", "cool", "lol"};
		WordCounter w = new WordCounter(t1);
		
		System.out.println(w.maxVal());

	}

}

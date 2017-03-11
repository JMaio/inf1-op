package week7;

import stdlib.StdDraw;

public class WordCounterHistogram {

	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer("src/week7/melville-moby_dick.txt");
		String[] tokens = tokenizer.getTokens();

		WordCounter wordCounter = new WordCounter(tokens);
		System.out.println(wordCounter.getFreqDist());
		double[] points = wordCounter.map2array();
		
		int n = points.length;
		StdDraw.clear();
		StdDraw.setXscale(0, n - 1);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.5 / n);
		for (int i = 0; i < n; i++) {
		    StdDraw.line(i, 0, i, points[i]);
		}

	}

}

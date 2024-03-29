package week3;

public class MeanVariance {

	public static void main(String[] args) {
		
		int n = args.length;
		double[] set = new double[n];
		
		for (int i = 0; i < n; i++) {
			set[i] = Double.parseDouble(args[i]);
		}
		
		double mean = 0;
		double var = 0;
		
		for (double i : set) {
			mean += i;
		}
		
		mean /= n;
		
		for (double i : set) {
			var += Math.pow((i-mean), 2);
		}
		
		var /= n;
		
		
		System.out.println(mean);
		System.out.println(var);

	}

}

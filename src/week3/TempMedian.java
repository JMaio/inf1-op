package week3;

import java.util.Arrays;

public class TempMedian {

	public static void main(String[] args) {
		
		int[] set = new int[args.length];
		set[0] = Integer.parseInt(args[0]);
		
		
		for (int i = 1; i < args.length; i++) {
			if (args[i].equals(".")) {
				set[i] = set[i-1];
			}
			if (args[i].equals("+")) {
				set[i] = set[i-1] + 1;
			}
			if (args[i].equals("-")) {
				set[i] = set[i-1] - 1;
			}
		}
		
		for (int i : set) {
			System.out.print(i + " ");
		}		
		
		System.out.println();
		
		// sort set
		Arrays.sort(set);
		
		for (int i : set) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		if (set.length % 2 != 0) {
			
			int out = set[set.length/2];
			System.out.println(out);
			
		} else {
			
			double out = ((set[set.length/2] + set[(set.length/2) - 1]) / 2.0);
			System.out.println(out);
			
		}
		
		;
	}

}

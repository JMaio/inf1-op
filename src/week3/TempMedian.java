package week3;

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
	}

}

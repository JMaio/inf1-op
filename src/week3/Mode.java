package week3;

public class Mode {

	public static void main(String[] args) {
		
		int[] dataset = new int[args.length];
		int[] count = new int[10];
		
		for (int i = 0; i < args.length; i++) {
			dataset[i] = Integer.parseInt(args[i]);
		}
		
		for (int i = 0; i < dataset.length; i++) {
			count[dataset[i]] += 1;
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print("[" + i + "s: " + count[i] + "]");
			
			if (count[i] != 0) {
				System.out.print(" ");
			
				for (int d = 0; d < count[i]; d++) {
					System.out.print(".");
				}
				
			}
			
			System.out.println();
			
		}
		
		int[] maxM = new int[2];
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] > maxM[1]) {
				maxM[0] = i;
				maxM[1] = count[i];
			}
		}
		
		System.out.println("Mode: " + maxM[0]);		

	}

}

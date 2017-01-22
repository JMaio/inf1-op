package week3;

public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] nums = new int[args.length];
		int[] copy = new int[args.length];
		
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = Integer.parseInt(args[i]);
		}
		
		
		for (int n = 1; n <= copy.length; n++) {
			nums[n-1] = copy[(n % nums.length)];
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		
	}

}

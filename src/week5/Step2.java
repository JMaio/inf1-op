package week5;

public class Step2 {
	public static void main(String y[]) {
		int a = Integer.parseInt(y[0]);
		int b = Integer.parseInt(y[1]);
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println(a + " cannot be greater than " + b);
		}
	}
}
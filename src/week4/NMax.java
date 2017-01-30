package week4;

public class NMax {

	public static void main(String[] args) {
		double a = StdIn.readInt();
		double b = StdIn.readInt();
		double c = StdIn.readInt();

	}
	
	
	public static int max(int a, int b, int c) {
		if (a > c && a > b)	return a;
		else if (b > c)		return b;
		else 				return c;

	}
	
	public static double max(double a, double b, double c) {
		if (a > c && a > b)	return a;
		else if (b > c)		return b;
		else 				return c;
	}

}

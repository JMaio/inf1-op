package week4;

public class NMax {

	public static void main(String[] args) {
		double a = stdlib.StdIn.readInt();
		double b = stdlib.StdIn.readInt();
		double c = stdlib.StdIn.readInt();

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

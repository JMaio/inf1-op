package week4;

public class IsTriangular {

	public static void main(String[] args) {
		double a = StdIn.readDouble();
	    double b = StdIn.readDouble();
	    double c = StdIn.readDouble();
	    
	    if (isTri(a, b, c)) {
	        System.out.printf("%s, %s and %s could be the lengths of a triangle\n", a, b, c);
	    }
	    else {
	        System.out.println("Not a triangle.");
	    }
	}

	public static boolean isTri(double a, double b, double c) {
		
		double hyp = Math.max(Math.max(a, b), Math.max(b, c));
		double s1 = Math.min(a, b);
		double s2 = Math.min(b, c);
		
		if (hyp < (s1 + s2)) {
			return true;
		} else {
			return false;
		}
		
	}
		

}

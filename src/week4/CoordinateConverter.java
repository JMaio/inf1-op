package week4;

public class CoordinateConverter {

	public static void main() {
		
	}
	
    public static double convertXYtoR(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public static double convertXYtoT(double x, double y) {
        return Math.atan2(y, x);
    }

    public static double convertRTtoX(double r, double theta) {
        // ADD CODE HERE
    }

    public static double convertRTtoY(double r, double theta) {
        // ADD CODE HERE
    }

    public static double convertDegToRad(double deg) {
        // ADD CODE HERE
    }

    public static double convertRadToDeg(double rad) {
        // ADD CODE HERE
    }

}
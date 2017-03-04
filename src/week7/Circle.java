package week7;

public class Circle {

	Point2DDouble mCentre;
	double mRadius;
	
	public Circle(Point2DDouble centre, double radius) {
		mCentre = centre;
		mRadius = radius;
	}
	
	public Circle() {
		mCentre = new Point2DDouble(0, 0);
		mRadius = 1;
	}
	
	public boolean isPointInside(Point2DDouble pt) {
		if (Point2DDouble.distance(mCentre, pt) < mRadius) {
			return true;
		} else {
			return false;
		}
	}
}

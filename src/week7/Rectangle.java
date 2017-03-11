package week7;

public class Rectangle {

	Point2DDouble mTopLeft;
	Point2DDouble mBottomRight;
	
	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight) {
		mTopLeft = topLeft;
		mBottomRight = bottomRight;
	}

	public Rectangle() {
		mTopLeft = new Point2DDouble(0, 0);
		mBottomRight = new Point2DDouble(1, 1);
	}

	public boolean isPointInside(Point2DDouble pt) {
		if (mTopLeft.getY() < pt.getY() && pt.getY() < mBottomRight.getY()) {
			if (mTopLeft.getX() < pt.getX() && pt.getX() < mBottomRight.getX()) {
				return true;
			}
		}
		return false;
	}

}

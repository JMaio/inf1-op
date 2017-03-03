package week7;

public class Interval {

	double mLeft;
	double mRight;
	
	public Interval(double left, double right) {
		mLeft = left;
		mRight = right;
	}
	
	public boolean doesContain(double x) {
		if (!isEmpty()) {
			if (x >= mLeft || x <= mRight) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (mLeft > mRight) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean intersects(Interval b) {
		if (!isEmpty() && !b.isEmpty()) {
			if (mLeft <= b.mLeft) {				// this has range further left than b
				if (mRight > b.mLeft) {			// this has range further right than b
					return true;
				}
			} else if (mRight >= b.mRight) {
				if (mLeft < b.mRight) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		if (isEmpty()) {
			return "Interval: (EMPTY)";
		} else {
			return String.format("Interval: [%.1f, %.1f]", mLeft, mRight);
		}
		
	}
	
	public static void main(String[] args) {
		Interval jInterv = new Interval(2.5, 5);
		System.out.println(jInterv);

	}

}

package week6;

public class Vector3D {

	double x;
	double y;
	double z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
	
	public double getTheta() {
		return Math.acos(z/getR());
	}
	
	public double getPhi() {
		return Math.atan2(y, x);		
	}
	
	public static Vector3D add(Vector3D lhs, Vector3D rhs) {
		Vector3D vNew = new Vector3D(0, 0, 0);
		
		vNew.x = (lhs.x + rhs.x);
		vNew.y = (lhs.y + rhs.y);
		vNew.z = (lhs.z + rhs.z);
		
		return vNew;
	}
	
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
		Vector3D vNew = new Vector3D(0, 0, 0);
		
		vNew.x = (lhs.x - rhs.x);
		vNew.y = (lhs.y - rhs.y);
		vNew.z = (lhs.z - rhs.z);
		
		return vNew;
	}
	
	public static Vector3D scale(Vector3D v, double scaleFactor) {
		v.x *= scaleFactor;
		v.y *= scaleFactor;
		v.z *= scaleFactor;
		
		return v;
	}

	
}

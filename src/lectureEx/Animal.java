package lectureEx;

public class Animal {

	private String mName;
	
	public Animal(String name) {
		mName = name;
	}
	
	public void sleep() {
		System.out.println(mName + ": sleeping");
	}
	
	public void makeNoise() {
		System.out.println(mName + ": making noise");
	}

	public void roam() {
		System.out.println(mName + ": roaming");
	}
	
	public String getName() {
		return mName;
	}
	
	public static void main(String[] args) {}

}

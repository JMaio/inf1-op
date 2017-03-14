package lectureEx;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	public String woof() {
		return "Hi, my name is " + getName();
	}
	
}

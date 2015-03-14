
public class POOStudent extends Student {

	public POOStudent(String name, float grade, float hungerLevel) {
		super(name, grade, hungerLevel);
	}

	// overriding the abstract method
	// must be done!
	public void wakeUp(){
		
		System.out.println("let's program 24/7");
	}
}

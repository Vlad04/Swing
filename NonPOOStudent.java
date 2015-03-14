
public class NonPOOStudent extends Student {

	public NonPOOStudent(String name, float grade, float hungerLevel){
		super(name, grade, hungerLevel);
	}
	
	public void wakeUp(){
		
		System.out.println("I don't care about programming");
	}
}

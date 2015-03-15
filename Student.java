
// ABSTRACT CLASSES
// regular class - attributes and fully implemented methods
// interface - only method signatures
// abstract class - can have all!

// Abstract class objects can not be initialized
// Abstract classes can only be extended

public abstract class Student {

	private String name;
	private float grade;
	private float hungerLevel;
	
	// accessor methods
	public String getName() { return name; }
	protected void setName(String name) { this.name = name; }
	
	public float getGrade() { return grade; }
	protected void setGrade(float grade) { this.grade = grade; }
	
	public float getHungerLevel() { return hungerLevel; }
	protected void setHungerLevel(float hungerLevel) { 
		this.hungerLevel = hungerLevel; 
	}
	
	public Student(String name, float grade, float hungerLevel) {
		
		setName(name);
		setGrade(grade);
		setHungerLevel(hungerLevel);
	}
	
	public void procastinate(){
		
		System.out.println("I still have like 0.2 minutes to do that");
	}
	
	public void study(){
		
		System.out.println("I'm studying (or something)");
	}
	
	// abstract methods
	// (very similar to interfaces!)
	public abstract void wakeUp();
	
	
	
	
}

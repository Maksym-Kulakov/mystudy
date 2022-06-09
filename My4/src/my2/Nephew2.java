package my2;

public class Nephew2 extends Unkle{
	int age;
	
	public Nephew2 (String name, int age) {
		super(name);
		this.age = age;
		}

	//Abstract class methods			
	
	public void display() {
	System.out.println("2 name:" + super.getName() +  "age: " + age);	
	}
	
}

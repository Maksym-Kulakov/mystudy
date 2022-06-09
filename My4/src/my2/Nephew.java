package my2;

public class Nephew extends Unkle{
	int age;
	
	public Nephew (String name, int age) {
		super(name);
		this.age = age;
		}

	//Abstract class methods			
	
	public void display() {
	System.out.println("1 name:" + super.getName() +  "age: " + age);	
	}
	
}

package my2;

public class Person extends Animal{

	private int age4;
	
	
	
	public Person () {								//no-arg constructor
			
	}
	
// 	constructor for Person class with Super fields are not important because we can create object of Person with no-arg constructor and then using Set methods we can input values for Super fields (as they creating as default)
	
	public Person (int age, String name) {
		super(age, name);   						//constructor with arguments  = fields from extended class
				 
	}
	
	public Person (int age4) {
		                                         //constructor with argument  = field from Person class
		this.age4 = age4;
	
	}
	
	public void setAge4 (int age4) {
		this.age4 = age4;
	}
	
	public int getAge4 () {
		return age4;
	}
	
	
	public void outInfo () {
		System.out.println(1000-getAge());				// method from interface
	}
	
	public void sayAlonePerson () {
		System.out.println("sayasPerson");
	}
	
}

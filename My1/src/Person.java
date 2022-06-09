
public class Person extends Animal implements Info{
	
	private int age;
	private String name;
	
	public Person() {
		
	}
	
	public Person(int age) {
		super.age = age;
	}
	

	
	
	public void live () {
		System.out.println("living");
	}
	
	 	
	
}

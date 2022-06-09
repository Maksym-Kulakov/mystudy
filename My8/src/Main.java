
public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal animal = new Animal();
		
		animal.demonstrateCat(cat);    //method called from Animal object with input parameter as Cat object with Animal field in code
		
		Animal.stDemonstrateCat(cat);	//method called from Animal class with input parameter as Cat object with Animal static field in code
		
		
		Mouse mouse = new Mouse(2, "Max");     //arguments in constructor but without access as no fields
		System.out.println(mouse);
		
		
		
	}

}


public class main extends Animal{

	public static void main(String[] args) {
 		 Person person = new Person();
		 Animal animal = new Animal();
 		 outInfo(person);
		 outInfo(animal);
		 	 
		Person person2 = new Person(4);
		outAge(person2);
		 
		Animal animal2 = new Animal(2);
		outAge(animal2);
			
		allData(30, "Max");
		
	}
	
	public static void outInfo (Info info) {
		info.live();
	}
	
	public static void outAge (Animal animal) {
		animal.ageCount();
	}
	
}

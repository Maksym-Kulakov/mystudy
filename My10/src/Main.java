/* Important - when you create Constructor for Animal class with parameter as Class Cat fields 
 * (Cat mycat)  * 
 * during object creating for Animal we need to put as arguments -> object of Class Cat
 * 3 ways:
 * 1) as "new" without exact name of object of Cat class
 * (new Cat());
 * 2)
 * Cat somecat = new Cat();
 * (somecat);
 * 3) parameter for creating object of Class Cat
 */




public class Main {

	public static void main(String[] args) {


		 
// Animal object creating with args constructor   =    arguments = objects of String & Cat classes (without their names)
		
		
		
		Animal animal2 = new Animal(new String("barsik"), new Cat(7));
		
		System.out.println(animal2.getName() + "\n" + animal2.getMyCat() + "\n" + new Cat(7).getCatAge());
		
//  Animal object creating with args constructor   =    arguments = objects of String & Cat classes (with names created before) 
		
		
		String somename = new String("Han");
		Cat mycathan = new Cat(4);
		
		Animal animal3 = new Animal(somename, mycathan);
		
		System.out.println(animal3.getName() + "\n" + animal3.getMyCat() + "\n" + mycathan.getCatAge());
		
// Animal object creating with args constructor   =  arguments = constructor arguments of objects of String & Cat classes
		
		Animal animal4 = new Animal ("Cheap", 7);
		
		System.out.println(animal4.getName() + "\n" + animal4.getMyCat() + "\n" + animal4.getMyCat().getCatAge());
		
		
		// object in parametr
//		Animal animal = new Animal("Barsik", 3);
//		 animal.name = "new Barsik";
//		 animal.mycat = new Cat(9);
		 
// Animal object creating with no-arg constructor & following set methods
		
//		Animal animal = new Animal();
//		
//		Cat barsik = new Cat();
//		animal.setMyCat(barsik);
//		
//		
//		String name = new String();
//		animal.setName(name);
		
	}

	
	
	
}

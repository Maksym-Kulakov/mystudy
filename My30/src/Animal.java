
public class Animal {
	
	int x;
	String name;
	
	Animal(){
		
	}
	
	
	Animal (int x, String name){               //usual constructor
		this.x = x;
		this.name = name;
		
	}
	
	public static Animal autoMeth0() {        //static method with return type as object creating as per instled construcor 
		int y = 0;								//without parameters -> method as auto input arguments for constructor
		String name = "zero";
		return new Animal(y, name);
	}
	
	public void printArg () {
		System.out.println(this.x + this.name);
	}
	
	public static void stPrintArg (Animal animal) {
		animal.printArg();
	}
	
	
	public static Animal animMeth(int x) {       //static method with return type as object creating as per instlled construcor 
		String name = "www";                   //with one parameter for input & another as auto input argument
		return new Animal(x, name);
	}
	
	public void someMeth () {
		System.out.println("some letters");
	}
	 
//// with composition in constructor 	
	
	Dog dog;
	
	Animal (Dog dog) {
		this.dog = dog;
	}
	
	public static Animal animMeth(String name) { 
		Dog dog = new Dog();
		return new Animal(dog);
}
	
	// non-static method (called via object) with input & output object 
	
	public Animal objFromObj (Animal animalin) {
		Animal animalout = new Animal();
		animalout.name = animalin.name;
		return animalout;
	}
	
	
	
	
}

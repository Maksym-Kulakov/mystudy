
public class Main {

	Animal animal5;
	
	Animal animal7;
	
	public static void main(String[] args) {
		
		new Animal(5, "Bred").printArg();;   // object without name
		
		Animal animal = new Animal(3, "john"); 	//usual method
		
		
		Animal animal222 = new Animal(3, "john222") {      //object of anonym subclass
			@Override
			public void printArg () {
				System.out.println(this.name);
			}
		};
		animal222.printArg();
		
		Animal animal2 = Animal.animMeth(5);    //instead of constructor we can put static method with return type as "new Animal"
		
		System.out.println(animal2.x + animal2.name);
		
		
	// using static method (as abovementioned) for creating object with auto input arguments for Animal constructor
		
		Animal animal4 = Animal.autoMeth0();
		animal4.printArg();
		
	// short version of above mentioned without name of object
		
		Animal.autoMeth0().printArg();
		
	// field declared in class & here determined	
		
		Animal animal5 = Animal.autoMeth0();    // field becoming name of appr object
		
		animal5.printArg();
	
	
	
		//field declared in class & here determined + object composition in static method for object creating
		
		Animal animal7 = Animal.animMeth(new Dog().getName("Rex"));
		Animal.stPrintArg(animal7);
	
		// creating object by non-static method with input & output object (name coming fm input object to output)
		
		Animal animal10 = animal.objFromObj(animal222);
		System.out.println(animal10.name);
	
	}


	
}

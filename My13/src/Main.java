//Objects to be created ("new") only in main method except field with String (when identifying is also as object creating)

public class Main {
//Fields working in main static methods
	//Non static
	//1), 2)
	int i;
//	i = 4;        NO possible as its value can be input only with object as it`s non-static method
	int u;
	
	int z = i + u;  //but possible to declare some operations for value;
	
	/////////////////
	//3)
	
	int m = 5;
	int d = 7;
	int f = m + d;
	
	//Static fields
	
	static int mix;
	
//Fields working in non-static methods
	
	int x;
	int y;
	
	
	
	
	public static void main(String[] args) {
		
		new Animal().someMethod();;
		
		
		
		//Local fields  - CAN NOT be STATIC 
		int i;          
		i = 4;          //possible as it`s local variables in method // and this "i" is different with Main class "i"
		System.out.println(i);
		
		//Non-static fields
		Animal animal = new Animal();
		animal.age = 13;                  //value can be input only with object as it`s non-static method
		animal.year_now = 2023;          //it`s can be overrided

		
		Main main = new Main();
		//1)
		main.i = 5;
		main.u = 4;
		System.out.println(main.z);  //no working as value linked to object & no linked are different
		//2)
		main.z = main.i + main.u;
		System.out.println(main.z);  // working as "z" linked to object same as "i" & "u".
		//3)
		System.out.println(main.f);
				
//		System.out.println(m); //no possible to use without object
		System.out.println(main.m);   //it`s working
		
		//4) acting non-static method with static field for object
		main.someMainMethod();
		
	//Static fields
		
		Main.mix = 9;
		System.out.println(Main.mix);
		
	//using "this"         -          NO possible non-static fields in Static method -> only via objects
		
	//	this.x = 2;        
	//	this.y = 7;
		
		
		
	}
	
	public void someMainMethod () {
		x = 5;
		y = 9;
		mix = 14;                  // POSSible static fields in Non-static methods
		System.out.println(x+y+mix);
	}
	
	

}

package my2;

public abstract class Animal{
	 
	static int boren;			       //static field 

	public static void sayAnonym (String string) {                    			 //static method
		System.out.println(string + "    " + boren);            //in static method can be only static field 
	}
	
	
	//for objects
	
	private int age;         //field for object creating (but static as we like use it in static method)
	private String name;     //field for object creating
	
	public Animal() {          //no-arg constructor (as default if no other constructors)
		
	}
	
	public void sayAlone () {
		System.out.println("I am alone");
	}
	
	public void say (String sounds) {              //method with OWN arguments
		System.out.println(sounds);
	}
	
	
	public Animal(int age, String name) {          //constructor with arguments = fields
		this.age = age;
		this.name = name;
	}
	
	
	public void idKarta() {								 //method with arguments as fields of CONSTRUCTOR
		System.out.println("age="+(age)+" " + name);
	}
	
	public void totalInfo(int num) {						//method with arguments as fields of CONSTRUCTOR  &   with OWN arguments
		System.out.println(num + "id"+(age+1)+" " + name);
	}
	
	
	
		
	public void setAge (int age) {					//to give access for value changing
		this.age = age;
	}
	
	public int getAge () {							//to give access for value using
		return age;	
 }
	
	public void setName (String name) {				//to give access for value changing
		this.name = name;
	}
	
	public String getName ( ) {						//to give access for value using
		return name;
	}
		
	
	public void outInfo () {
		System.out.println(100-age);				// method with argument as field of CONSTRUCTOR 
	}
	
	public static void outInfo2 (Animal animal) {        //this static method (can work without object) but with argument as object of Animal
		animal.outInfo();								//code of outInfo no possible to input here directly as in Static can not be no-static fiel "Age"
	}													//and "age" can not be static as its used in Animal constructor (static only for class)
	
	
	public void outInfo3 (Animal animal) {				//method with code for "Age" field from object - not from parameter animal
		System.out.println(1000-age);
	}
	
	public void outInfo4 (Animal animal) {				//method with code for "Age" field from object and for parameter animal "Age"
		
		System.out.println(animal.getAge() + age);
	}
	
	public void outInfo5 (Animal animal, Animal animal2) {				//method with code for "Age" field from object and for parameter animal "Age"
		
		System.out.println(animal.getAge() + animal2.getAge() + age);
	}
	
	
	
//	put method of object WITH Argument as Animal object in Static method fm class
	
	
	public void outInfo6 (Animal animal) {
		System.out.println(10 + animal.getAge());             //getAge taken fm object as argument
	}
	
		public static void stoutInfo6 (Animal animal) {
			animal.outInfo6(animal);
		}
	
//	put method of object WITHOUT Argument as Animal object in Static method fm class		

		public void outInfo7 () {
			System.out.println(10 + age);						
		}
		
			public static void stoutInfo7 (Animal animal) {			//Age taken fm object as field of object 
				animal.outInfo7();
			}
			
			
			

			
			
			
}

package my2;

public class Main {

	public static void main(String[] args) {
		
		
		
		// working with static method
		
		Animal.boren = 5;							   //can be set/used directly as public access		
		
//		Animal.sayAnonym("no need object");            //method working without object
		
		
/////working with object of Animal
		
		// 1 - Object with no-arg constructor          (but fields rcvd default values)
		
	//	Animal animal = new Animal();         !!!!!!    NO OBJECT FOR OBSTRACT CLASS
	 
			
		// 2 - Object with arg constructor & following corrections via set/get
		
	//	Animal animal2 = new Animal(2, "Wolf");    !!!!!! NO OBJECT FOR OBSTRACT CLASS
		
				
	
		
/////working with object of Person	
		
		// working with static method
		
		Person.boren = 5;							   //can be set/used directly as public access		
		
		Person.sayAnonym("no need object");            //method working without object
				
		
		// 1 - Object with no-arg constructor          (but fields rcvd default values)
						
		Animal person = new Person();            //object with no-arg constructor but automatically exist fields of Animal (0, null)
		
		person.sayAlone();                         // method without args
		person.say("au");						  // method with arg only fm method
					
		System.out.println(person.getName() + person.getAge());    	//object fields fm Animal can be used
	
		
		// 2 - Object with arg constructor & following corrections via set/get
		
		Animal person2 = new Person(30, "Max");              //object with constructor of Animal fields
		
		
		person2.setAge(45);								//  no access to change value (if Private) therefore we need get & set
		
		person2.setName("Maksym");						//  no access to change value therefore we need get & set
		
		person2.getAge();								//  no access to present value therefore we need get & set
		
		System.out.println(person2.getAge());          // // to use "Age" for method syso 
		
		person2.idKarta();									//method with arguments as fields of Constructor - starting fm Object
		
		person2.totalInfo(111);                         //method with arguments as fields of Constructor  &   with own arguments - starting fm Object
		
		
		Animal.outInfo2(person2);					 //static method with argument as object of Animal/Person  - starting fm Class
		
	
		person2.outInfo();                         //Non-static method as above but starting fm Object
	
	
		//mix above 2 methods - Non-static method with argument as object of Animal/Person  - starting fm Object
		
		
		Animal person3 = new Person(1000);    //it`s field "Age" of Person class 
		person3.setAge(1000);					//that`s why we need set value for Animal field "Age" as method use Animal field
	
		person2.outInfo3(person3);				//in method  working field of person2 object "age", not person 3 (as parameter not in method used)
		
		person3.outInfo3(person2);				//in method  working field of person3 object "age", not person 2 (as parameter not in method used)
		
		person2.outInfo4(person3); 				//in method  working field of person2 object "age", and person 3 (as parameter used in method)
												//"Age" fm person2 = 45, "Age" fm person3 = 1000. 	Code 1000+45=1045


		
/////working with object of Child		
		
		Animal child1 = new Child();	
		child1.sayAlone(); 
		
		Person child2 = new Child();
		child2.sayAlonePerson(); 
		
		Child child3 = new Child();
		child3.sayAlone();
		child3.sayAlonePerson();
		child3.setAge(2);
		child3.setName("Danyil");
		child3.idKarta();
	
		Animal.stoutInfo6(child3);
		
		Animal.stoutInfo7(child3);
		
		
		// Method with elements of Class Child	- without SUPER classes - 

		Child child4 = new Child(5);		
		Child.yearsKitaOut(child4);
		
		Child child5 = new Child();	
		Child.yearsKitaOut(child5);
		
	 //Creating object of childclass of Abstract class
		
		Nephew nep = new Nephew("Max", 30);
		Nephew2 nep2 = new Nephew2("Danyil",2);
		
		nep.display();
		nep2.display();
		
		
		
	
	}
	
	// No possible to create Static method with inner method with own parameters;
	
	
	
	
	
	
	
	
//	public static void finalextendInfo(Animal animal) {
//		animal.idKarta();
//		
//			
//	}

}

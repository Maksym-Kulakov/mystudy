import Bicycle.Wheel;

//Inner classes are used when we no need some class are separate - they can not be used without Outer class
//we can create object of Inner only with basing on Outer class

public class Main {
	public static void main(String[] args) {
		
		//Object of outer class with appr method
		Bicycle bicycle1 = new Bicycle("BMX", 4, 90);
		bicycle1.start();
		
//		HandleBar handleBar = new HandleBar();         no possible to create as inner class
	
		//as inner class is Public - here in Main we can create its object
		
		//new inner object can be created only basing on outer object
		
		// 1 //Classic method of object creating with appr method
		Bicycle.HandleBar handle1 =  bicycle1.new HandleBar(); 
		handle1.left();

		
		// 2 //Object of Outer class creating via static method
		//but this object is anonym & we cannot use for object of Inner class creating
		Bicycle bicycle2 = Bicycle.createBicycle("Tisa", 10, 40);
		Bicycle.HandleBar handle2 = bicycle2.new HandleBar();
		
		// 3 //...via static method in short version - even without NAME of object of Outer class
		Bicycle.HandleBar handle3 =  Bicycle.createBicycle("Ukraine", 15, 20).new HandleBar();
		
		
		//Method with field of Outer class, which was initialised during object of Outer class creating 
		handle1.priceByc();
		handle2.priceByc();
		handle3.priceByc();
		
		//as inner class is Private  - here in Main we can not create its object
		//we can do that only in outer class
//		Bicycle.Seat seat1 = bicycle1.new Seat();
//		seat1.down();
		
		
		Bicycle.Wheel wheel;   //object of inner Static class can not be created basing on object of outer class
		
		
		
	}
}

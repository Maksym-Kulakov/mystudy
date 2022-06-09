// import allows to work at this main class as work in the same main class at Package my2 
// and all methods are available for object of classes in my2
// but extension allows to work with all methods for object creating in this class

package myside;

import my2.Animal;
import my2.Child;

public class mainside extends Animal{

	public static void main(String[] args) {
//		my2.Animal animal = new my2.Animal();   // this form is correct but not useful

		//all methods are available for object of classes in my2		
		
		Animal child = new Child();
		child.setAge(12);
		child.getAge();
		System.out.println(child.getAge());
		
		
		//extension allows to work with all methods for object creating in this class
		mainside mainside = new mainside();
		mainside.setAge(9);
		mainside.getAge();
		System.out.println(mainside.getAge());
		
		
		
	}

}

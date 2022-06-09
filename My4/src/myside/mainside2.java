// import allows to work at this main class as work in the same main class at Package my2

package myside;
import my2.Animal;
import my2.Child;


public class mainside2 {

	public static void main(String[] args) {

		//all methods are available for object of classes in my2	
		Animal child = new Child();
		child.setAge(12);
		child.getAge();
		System.out.println(child.getAge());

	}

}

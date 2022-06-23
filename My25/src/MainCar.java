
public class MainCar {

	public static void main(String[] args) {

//After creating outer object car - automatically created inner objects   		
		
	Car car = new Car();

	Car.Door door = car.new Door();
	
	System.out.println(car.height);
	
	System.out.println(car.doors);
	 
	
 
	}
}

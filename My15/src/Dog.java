
public class Dog extends Animal{

	//no-arg constr possible only if no-arg constructor is available in super class
	
	public Dog () {
		
	}
	
	
	public Dog(String name, int age) {
		super(name, age);
		 }

	@Override
	public int ageThen (int year_then) {
		int year_now = 2022;
		int ageThen = (year_then-year_now) + super.getAge();
		System.out.println(ageThen);
		return ageThen;
		
	}

	@Override
	public void outInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
      public void qntyOfLaps2 (String name) {
		
		int i;
		
		switch (name) {
		
		case "tuzik":  
			 i = 4;
			break;
		case "rex": 
			 i = 2; 
			break;
		default:  
			i = 0;
			break;
		}
		
		System.out.println(i);
		
	 
		
		}
	
      //method RETURN type - firstly create local Field for return - and then operation for it - finally "return"
      //return field decklared is inside method
	public static int qntyOfLaps (String name) {
		
		int i;
		
		switch (name) {
		
		case "tuzik":  
			 i = 4;
			break;
		case "rex": 
			 i = 2; 
			break;
		default:  
			i = 0;
			break;
		}
		
		return i;
		
		
		}

// Static method with static inner methods as above mentioned but with RETURN type (as we need values for calculation operations)
	
	public static void totalLaps (String name1, String name2) {
	
		
	int dog1 = Dog.qntyOfLaps(name1);
	int dog2 = Dog.qntyOfLaps(name2);
	
	int totalDog = dog1 + dog2;
	System.out.println(totalDog);
	
	}
}

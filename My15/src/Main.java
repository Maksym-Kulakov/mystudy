
public class Main {

	public static void main(String[] args) {

// some - object of anonym subclass for superAnimal class - with two overriding methods as VOID & RETURN type
		
		Animal some = new Animal("Barsic", 15) {
			
			int ageThen;

//method with local field "year_now", with object field "this.ageThen", with value taken fm method as object of superAnimalclass  
			
			@Override
			public int ageThen(int year_then) {
				int year_now = 2022;
				this.ageThen = (year_then-year_now) + super.getAge();
				return this.ageThen;
			}
			
//return field declared is outside method - as object field 

			@Override
			public void outInfo() {
				System.out.println(ageThen);
			}
			
		};

		some.ageThen(2030);
		some.outInfo();
		
		//Object creating for following method implementation 
		//But firstly we create field reference - and then - object creating as initialising
		
		Dog someDog;
		someDog = new Dog();
		
		// non-static method with SWITCH - with VOID type
		
		someDog.qntyOfLaps2("tuzik");
		
		// Static method with static inner methods as above mentioned but with RETURN type (as we need values for calculation operations)
		
		Dog.totalLaps("tuzik", "tuzik");
		
		
	}

}

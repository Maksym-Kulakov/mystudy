//All abstract methods to be overrided

public class Child1 extends Abstr {

	public int price;
	
	public Child1() {
		
	}
	
	public Child1(String model, int maxSpeed) {
		super(model, maxSpeed);
	}
	
	
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice () {
		return price;
	}
	
	
   @Override
   public void gas() {
       System.out.println("Kia газует!" + super.getEuro() + "price" + price);
   }

   @Override
   public void brake() {
       System.out.println("Kia тормозит!");
   }
   
   
}
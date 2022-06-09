// As usual parent class but no possible to create object of this class (but constructor can be created)

public abstract class Abstr {

	
   private String model;
   private String color;
   private int maxSpeed;
   private String euro;
   
   public Abstr() {
	   
   }
   
   public Abstr(String model, int maxSpeed) {
	   this.model = model;
	   this.maxSpeed = maxSpeed;
   }
   
   
   public abstract void gas();

   public abstract void brake();

   public void doc() {
	   System.out.println("regestered  " + model);
   }
   
   
   public void setEuro (String euro) {
	   this.euro = euro;
   }
   
   public String getEuro () {
	   return euro;
   }
   
   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public int getMaxSpeed() {
       return maxSpeed;
   }

   public void setMaxSpeed(int maxSpeed) {
       this.maxSpeed = maxSpeed;
   }
}

public class Bicycle {

   private String model;
   private int weight;
   private int price;
   

   public Bicycle(String model, int weight, int price) {
       this.model = model;
       this.weight = weight;
       this.price = price;
   }

   public void start() {
       System.out.println("Поехали!");
   }
   
   //possible to create object of Outer class via static method
   
   public static Bicycle createBicycle(String model, int weight, int price) {	   
	   return new Bicycle(model, weight, price);
   }
   
   
   
   //we can create object only in this  outer class
//   Bicycle bicycle7 = new Bicycle("Some", 1, 1);
//   Bicycle.Seat seat1 = bicycle7.new Seat();
   
   
   
   

   public class HandleBar {
	   
	   public HandleBar(){
		   
	   }

       public void right() {
           System.out.println("Руль вправо!");
       }

       public void left() {

           System.out.println("Руль влево!");
       }
 
       //method of inner class can use field of outer class even if it`s private    
       public void priceByc() {
    	   System.out.println("cost " + Bicycle.this.price);
       }
       
       
//NO possible to create object of Inner class via static method  
//because Static methods & fields can not be in Inner class       
//as all methods of Inner class starts fm Object of outer - and Static is out of object       
       
//       public static HandleBar createHandle() {
//    	   return new HandleBar();
//       }
       
       
   }

   private class Seat {

       public void up() {

           System.out.println("Сиденье поднято выше!");
       }

       public void down() {

           System.out.println("Сиденье опущено ниже!");
       }
   }
   
   public static class Wheel {
	   
   }
   
   
}
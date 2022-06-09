
public class Test {

	public static void main(String[] args) {
		 
		System.out.println(new Child1 ("rrr", 4).getModel());
		
		
		Child1 kia11 = new Child1 ();      // all methods possible as object was created on level of Child class
		
		kia11.setPrice(4);                 //usual method - code in method	
		kia11.setEuro("euro-4");		   // usual method - code in Abstr	
		kia11.gas();					   // abstract method - code in Child	
		
		Abstr kia = new Child1();
		
		kia.setEuro("euro-6");
		 
//		kia4.setPrice(4);      method is no possible as object was created on level of Abstract class
		 
		 
		 kia.gas();					 // abstract method - code in Child	
		 kia.brake();                // abstract method - code in Child
		 
		 kia.setModel("KIA");		// usual method - code in Abstr	
		 kia.doc();					// usual method - code in Abstr	
		 
		 
		 
		 
		 
		 Child2 fiat = new Child2();
		 
		 fiat.gas();				// abstract method - code in Child	
		 fiat.brake();				// abstract method - code in Child		
		 
		 fiat.setModel("FIAT");		// usual method - code in Abstr	
		 fiat.doc();				// usual method - code in Abstr
		 
		 
		 
	}

}


public class Main {

//NOT Final fields
	
	int i = 1;   //can be changed only in some method with Object
	
	static int m = 1;   //can be changed only in some method with Class level
	
//FINAL fields 

//	final int SOME;                no possible = it`s can be only in methods
//	SOME = 4;
	
	
	final int CONST_1 = 100;
	
	final int CONST_2; //final non-static can be without initialisation as it can be done in constructor;
	
	static final int CONST_3 = 69; //final  static can NOT be without initialisation as it can NOT be done in constructor as no relation to object;;
	
	{									//can be with-out "public Main"
		this.CONST_2 = 5;
	}
	
	
//Methods to change non-final fields
	
	public int change () {
		this.i = 10;
		return i;
		}
	
	public static int changeSt () {
		Main.m = 100;
		return m;
		}
	
	public int iGet () {
		return i;
		}
	

	public static int getSt () {
		return m;
		}
	
public static void main(String[] args) {
	
	System.out.println(new Main().change());      //field changed only for this object
	System.out.println(Main.changeSt());   
	
	System.out.println("after change==============================");
	
	System.out.println(new Main().iGet());   //field remained as declared in class
	System.out.println(Main.getSt());      //field changed for whole class
	
	//Fields of Class as reference to object
	System.out.println("work with objects=========================");
	
	
	  final StringBuilder sb = new StringBuilder("www");
	  System.out.println(sb);
	  
	  System.out.println(sb.append(2));
	  
	//Final local field
	  
	 


	  
	  
	
}	


////Methods to change FINAL fields

public int changeFinal () {
//	this.CONST_1 = 10;         !!!  no  possible to change
	return CONST_1;
	}

public static int changeStFinal () {
//	Main.CONST_3 = 100;				!!!  no  possible to change
	return CONST_3;
	}
	


}



public class Kata8 {
	public static String getMiddle(String word) {
		String fin = "";
		int x = word.length()%2;
		
        if (word.length() == 1) {
			fin = word;
		}else if (word.length() == 0) {
			fin = "";
		}else if(word.length() == 2) {
			fin = word;
		}else{
		if( x == 0) {
			fin = word.substring(((word.length()/2) - 1), ((word.length()/2) + 1));
		}else {
			fin = word.substring((word.length()/2), (word.length()/2) + 1);
		}
		}
        

		return fin;
	  }	
	
	public static void main(String[] args) {
		System.out.println(Kata8.getMiddle("worldee"));
 
		
	}
	
}

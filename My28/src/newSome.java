
public class newSome {
	public static boolean validateUsr(String s) {
		boolean result2 = false;
		String p = s.replaceAll("\\s+","");
		boolean f = s.equals(p);
		String s2 = s.toLowerCase();
		String under = "_";
		String space = " "; 
		char currentchar;
		if (f == false) {
			result2 = false;
			} else {
				if (s.length() >= 4 && s.length() <=16) {
					 					
					for (int i = 0; i < s.length(); i++) {
						currentchar = s.charAt(i);
					
					if (Character.isDigit(currentchar) || under.contains(String.valueOf(currentchar))) {
						result2 = true; 
						if (s.equals(s2)) {
						result2 = true;
						} else if (s.equals(s2) == false){
						result2 = false;
						}
					} else if (Character.isLowerCase(currentchar)) {
						result2 = true; 
						if (s.equals(s2)) {
							result2 = true;
						} else if (s.equals(s2) == false){
							result2 = false;
						}
					}
				  } 
		} else {
			result2 = false;
		}
	}
		return result2;
	}
	public static void main(String[] args) {
		System.out.println(newSome.validateUsr("asd43_34"));
	}
	
}

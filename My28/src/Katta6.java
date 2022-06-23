 

public class Katta6 {

	public static long[] powersOfTwo(int n){
		
		long [] res = new long [n+1];
		res[0] = 1;
		
		for(int i = 1; i < res.length; i++) {
			res[i] = 2*res[i-1];
			
		}
		
		
		
		
		
		return res;
	}
	
	public static void main(String[] args) {
		long[] t = Katta6.powersOfTwo(1);
		for(long x : t) {
			System.out.println(x);
		}
		
	}
	
	
}

package my2;

public class Child extends Person {
		public int kita;
		
		public Child () {
			
		}
		
		public Child (int kita) {
			this.kita= kita;
		}
		
		public void setKita (int kita) {
			this.kita = kita;
		}
		public int getKita () {
			return kita;
		}
		
		public void yearsKita () {
			 System.out.println(getKita());
		}
		
		public static void yearsKitaOut (Child child) {
			child.yearsKita();
		}
		
		
}

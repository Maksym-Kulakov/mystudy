import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		class Child {		
			String name;
			Child(String name){
				this.name = name;
			}
		}	
		abstract class Super{          //can not be Static & can be used only in Main	 
			List <Child> child;		
			Super(List <Child> child){
				this.child = child;
			}	
			abstract void some();
		} 
			Child ch1 = new Child("q");
			Child ch2 = new Child("w");
			Child ch3 = new Child("e");	
			List <Child> someArray = new ArrayList();
			someArray.add(ch1);
			someArray.add(ch2);
			someArray.add(ch3);
			Super some = new Super (someArray) {
				@Override
				void some() {
					for (Child x : someArray) {
						System.out.println(x.name);
					}
				}
			};
			some.some();
	}
}

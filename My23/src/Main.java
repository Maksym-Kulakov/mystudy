import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		Method [] m = c1.getDeclaredMethods();
		for(Method sm : m) {
			System.out.println(sm.getName());
		}
	}
	
}

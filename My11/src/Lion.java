//Interesting that Constructor of Child class can consist of fields of Child class can be only if Parent class has no-arg constructor

public class Lion extends Mleko{

public int width;
	

	public Lion() {
		
	}

	public Lion(int age) {
		super(age);
	}
	
	public Lion(int age, int width) {
		super(age);
		this.width = width;
	}
	
	

	@Override
	public int qntyLegs() {
		System.out.println("4");
		return 4;
	}

	@Override
	public void country_city(String string1, String string2) {
		System.out.println(string1 + string2);
		
	}

	@Override
	public void eat() {
		switch (width) {
		case 1: System.out.println("only milk");
		break;
		case 2: System.out.println("only milk");
		break;
		default: System.out.println("everything");
		break;
		}
	}

	@Override
	public void drink() {
		if (age<4) {
		System.out.println("only water");
		}else 
		System.out.println("water & wine");
	}
	
}

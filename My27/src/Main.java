//Composition & extension with common generic method with parameter as List of objects

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		 Dog dog1 = new Dog();
		 
		 Dog dog2 = new Dog();
		
		 Dog dog3 = new Dog();
		 
		 List <Dog> dogsList = new ArrayList();
		 dogsList.add(dog1);
		 dogsList.add(dog2);
		 dogsList.add(dog3);
		
		 
		 
		List<Animal> animalList = new ArrayList<>(dogsList);
		 
		for(Animal an : animalList){
			System.out.println(an);
		}
				 
		printList(animalList);
		printList(dogsList);
		 
	}
	private static void printList (List<? extends Animal> some) {
		for(Animal an : some) {
			System.out.println(an);
		}
	
		
	}

}

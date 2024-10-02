package AbstractPackage;



public class TestAnimal {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.move();
		dog.sound();
		
		System.out.println("==================");
		
		Cat cat=new Cat();
		cat.sound();
         cat.move();
         
         System.out.println("=====================");
         
         Bird bird=new Bird();
         bird.move();
         bird.sound();
         
         
	}

}

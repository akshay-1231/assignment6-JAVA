Q3//
package AbstractPackage;

abstract  class Animal {
   

	abstract public void sound();
    abstract public void move();}
    class Dog extends Animal{
    	public void sound() {
    		System.out.println("the dog barks");
    		
    	}
    	public void move() {
    		System.out.println("the dog runs");
    		
    	}
    }
    class Cat extends Animal{
    	public void sound() {
    		System.out.println("the cat meows");
    	}
    	public void move() {
    		System.out.println("the cat runs");
    	}
    	
    }
    
    class Bird extends Animal{
    	public void sound() {
    		System.out.println("the bird flys");
    	}
    	public void move() {
    		System.out.println("the bird tweet");
    	}
    }
    


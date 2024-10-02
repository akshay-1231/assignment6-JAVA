Q1/
package assignment2;

public final class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
     //name and age can not changed
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


}

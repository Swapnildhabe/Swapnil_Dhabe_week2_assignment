package assignment_2;

//assignment_2
// 3) Write a program that uses constructors to initialize objects and demonstrates method overloading. 


public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println("Name :"+getName());
		System.out.println("Age :"+getAge());
	}
	public static void main(String[] args) {
		Person person = new Person("Swapnil Dhabe", 27);
		
		person.showPerson();
	}
	
}

package assignment_2;

//assignment_2
//2) Implement a BankAccount class with methods for deposit, withdrawal, and displaying the account balance.
public class Employee {
	private	String name;
	private int Age;
	private int RollNo;
	
	public Employee() {
		 this.name= "default";
		 this.Age= 0;
		 this.RollNo= 1;
	}
	
	public Employee(String name) {
		this.name=name;
	}
	public Employee(int Age) {
		this.Age=Age;
	}
	public Employee(int Age, int RollNo) {
		this.Age=Age;
		this.RollNo=RollNo;
	}
	public Employee(String name, int Age, int RollNo) {
		this.name=name;
		this.Age=Age;
		this.RollNo=RollNo;
	}
	public void detail() {
		System.out.println("Employee Name :"+this.name+"\n Employee Age :"+this.Age+"\n Employee Roll Number :"+this.RollNo);
		
	}
	
	public void detail(int Age) {
		System.out.println("Employee Age :"+Age);
	}
	public void detail(int Age, int RollNo) {
		System.out.println("Employee Age :"+Age+"\nEmployee Roll No :"+RollNo);
	}
	public void detail(String name, int Age, int RollNo) {
		System.out.println("Employee Name :"+name+"\nEmployee Age :"+Age+"\nEmployee Roll No :"+RollNo);
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee emp1 = new Employee(26);
		Employee emp2 = new Employee(27, 100);
	
	
		System.out.println(" Name :"+emp.name+"\n Age :"+emp.Age+"\n Roll Number :"+emp.RollNo);
		System.out.println();
		
		emp1.detail(0);
		
		emp1.detail(22);
		
		System.out.println();
		
		emp2.detail(28, 121);
		
		System.out.println();
		
		emp1.detail("Swapnil", 27, 111);
		
	}
	
	
}

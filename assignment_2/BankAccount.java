package assignment_2;

//assignment_2
//1) Create a class Person with attributes like name, age, and methods to display these attributes. 

import java.util.Scanner;

public class BankAccount {

	private double balance;
	
	public void deposit(double value) {
		balance += value;
		System.out.println("\t"+" Amount Is Deposit Succesfully. Value= "+value);
	}
	public void withdrawal(double value) {
		balance -= value;
		System.out.println("\t"+ value + " Amount Is Withdrawal Succesfully. ");
	}
	public void showBalance() {
		System.out.println("Your Current Balance is : "+balance);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		int option;
		System.out.println("Welcome To Cogitix Bank ");
		System.out.println("Select Any One Option :-");
		
		do {
			
		
		System.out.print(" 1) Deposit \n 2) Withdrawal \n 3) Show Balance \n 4) Exit \n  Option :-");
		option = sc.nextInt();
		
		switch (option) {
		case 1: {
				System.out.print("\t Enter Deposit Amount : ");
				double value = sc.nextDouble();
				ba.deposit(value);
				break;
		}
		case 2: {
				System.out.print("\t Enter Withdraw Amount : ");
				double value = sc.nextDouble();
				ba.withdrawal(value);
				break;
		}
		case 3: {
				System.out.println("Your Current Balance is : "+ba.balance);
				break;
		}
		case 4: {
			System.out.println("Thank For Banking With Us :)");
			break;
		}
		default:{
				System.err.println("\t Enter Valid Option ");
		}
				
	}
		
		} while (option != 4 );
	}
}

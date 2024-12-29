package exceptionExercise;

import java.util.Scanner;

import model.account.Account;
import model.exception.ExerciseException;

public class Main {

	public static void main(String[] args){

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter account data: ");
			System.out.print("number: ");
			int number = sc.nextInt();
			System.out.print("holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			Account acc1 = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc1.withdraw(amount);
			
			sc.close();
			
		}
		catch(ExerciseException e) {
			System.out.println("Account Error: " + e.getMessage());
		}	
	}
}

	



package model.account;

import model.exception.ExerciseException;

public class Account {
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;// limite de saque
	
	public Account() {
	}
		
	public Account(int number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}


	public void deposit(Double amount)  {
	
		balance += amount;

	}
	
	public void withdraw(Double amount) throws ExerciseException{
		if(amount>getWithdrawLimit()) {
			throw new ExerciseException("The amount exceeds withdraw limit");
		}else if((getBalance()-amount)<0){
			throw new ExerciseException("Not enough balance");
		}
		else{
		balance -= amount;
		System.out.println("New Balance: " + getBalance());
		}

	}

}

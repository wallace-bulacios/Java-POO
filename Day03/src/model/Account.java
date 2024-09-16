package model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private double balance;
	private static List<Account> accounts = new ArrayList<>();
	
	public Account() {
		this.balance = 0.0;
		accounts.add(this);
	}
	
	public Account(double initial_deposit) {
		this.balance =  initial_deposit;
		accounts.add(this);
	}
	
	//método que credita na conta
	public void depositFunds(double funds) {
		this.balance = balance + funds;
	}
	
	//método depita valor do funds
	public void withdrawFunds(double funds) {
		this.balance = balance - funds;
	}
	
	//metodo para buscar o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	  // Método estático para obter a lista de contas
    public static List<Account> getAccounts() {
        return accounts;
    }
}

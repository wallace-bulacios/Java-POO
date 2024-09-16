package view;

import model.Account;

public class Teller {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		Account account2 = new Account(100.00);
		Account account3 = new Account(500.00);
		
		//buscar saldo
		int totalAccounts = Account.getAccounts().size();
		System.out.println("Foi encontrado " + totalAccounts + " contas");
		
		 for (Account account : Account.getAccounts()) {
	            System.out.println("Account has the proper balance of " + account.getBalance());
	        }

	}

}

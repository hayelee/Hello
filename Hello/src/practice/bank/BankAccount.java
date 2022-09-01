package practice.bank;

public abstract class BankAccount {



	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	/**
	 * 계좌의 종류를 반환하는 메소드
	 * @return 계좌의 종류
	 */
	public abstract String getAccountType();
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
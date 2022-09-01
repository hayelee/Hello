package practice.bank;

public class Customer {
	/**
	 * 고객 이름
	 */
	private String firstName;
	/**
	 * 고객 성
	 */
	private String lastName;
	/**
	 * 고객이 소유한 계좌
	 */
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	@Override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %,d", firstName, lastName, numberOfAccounts);
	}
	
}
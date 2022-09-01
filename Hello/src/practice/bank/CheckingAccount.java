package practice.bank;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
		// 만약 SavingsAccount에 10000원이 있고,
		// CheckingAccount에 5000원이 있을 경우
		// 백지수표로 7500원짜리 물건을 구매했을 경우
		if (amount > balance) {
			protectedBy.balance -= amount - balance;
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}
	public String getAccountType() {
		return "당좌예금";
	}
}

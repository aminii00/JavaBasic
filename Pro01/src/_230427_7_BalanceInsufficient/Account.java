package _230427_7_BalanceInsufficient;

public class Account {

	public Account() {}
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money)  throws BalaceInsufficientException{
		if (balance < money) {
			throw new BalaceInsufficientException("�ܰ���� : " +(money-balance) + "���ڶ�");
		}
		balance -= money;
	}
}

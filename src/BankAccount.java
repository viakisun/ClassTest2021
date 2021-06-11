
public class BankAccount {
	// 멤버 변수
	// 예금주, 계좌번호, 잔액, 
	private String mOwner;
	private String owner;
	private int mAccountNumber;
	
	private int accountNumber;
	
	private long mBalance;
	
	private int mAccountIndex = 0;
	
	// 생성자
	// 계좌 개설

	public BankAccount(String owner) {
		mOwner = owner;
		this.owner = owner;
		mBalance = 0;
		
		createAccount();
	}
	
	private void createAccount( ) {
		mAccountNumber = mAccountIndex;
		this.accountNumber = 0;
		mAccountIndex++;
	}
	
	// 메서드
	// 잔액 조회
	// 입금
	// 출금
	
	public long getBalance() {
		return mBalance;
	}
	
	public void deposit(int amount) {
		mBalance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (mBalance < amount)
			return false;
		
		mBalance -= amount;
		return true;
	}
}

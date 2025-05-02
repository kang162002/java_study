package study.practice.practice33;

public class Account {

	
	private String owner; // 계좌 소유주
	private long balance; // 잔액 
	
	public Account () {		// 역명
		owner =null;
		balance = 0;
	}
	public Account(String owner) {		//  < 은행에 이름 적을시 
		this.owner = owner;
		balance=0;
	}
	public Account(long balnce) {	// < 숫자를 적을시
		owner= null;
		this.balance = balnce;
	}
	
	public Account( String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
		
		
	}
	
	
	// getter setter 메소드
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
			//	입금		(입금할 금액)
	public long deposit(long amount) { //  저축 메소드
		// 계좌 잔액 5만  > 3만 입금 > 잔액 8만
		balance += amount; // 입금
		
		return amount; // 8만
	}
	
	//			인출할		인출할 금액
	
	public long withdraw(long amount) {
		// 8만원 > 10만원 인축++
		//	1) 인출 불가 ! 금액 다시 입력
		//	2) 가능한 최대 금액인 8만원 ㅣ
		
		if (amount > balance ) {
			
			return 0;
			// return code 정할수있음 -1 잔액부족 -2 정지계좌 -3 등등
			
			
		}
		
		balance -= amount;
		return amount;
	}
	
	
		
	
	}
	


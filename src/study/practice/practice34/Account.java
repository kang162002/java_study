package study.practice.practice34;

public class Account {
	
	
	String num; // 계좌번호
	int balance; // 잔액

	public Account(String str, int i) {
	num = str;
	balance = i;
	}

	public String toString() {
		
	return String.format("Account { num: %s, balance: %d }", num, balance);
	}		//printf 처럼 포맷 형식으로 작성한 내용물을String 문자열로 return 
		//				송금: 금액을 넘길 계좌  , 넘길 금액	
	public boolean transfer(Account target, int amount) {
	if (balance < amount ) {
		/* 1. 잔액이 부족한 경우 false를 반환하세요. */
	return false;
	}

	/* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
	// balance -= ??;
	// target.balance += ??;
	balance -= amount;
	target.balance += amount;
	return true;
	

	}
}

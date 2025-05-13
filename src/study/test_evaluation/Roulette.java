package study.test_evaluation;

import java.util.Random;
import java.util.Scanner;

public class Roulette {
	Scanner scanner = new Scanner(System.in);

	// 기기아이디, 지점명, 총합포인트, 성공회수, 실패횟수, 잔여시도횟수, 매출액, 충전, 충전금액이남았나 true /false,

		private	String Machinery; 		// 기기아이디
		private	String BranchName; 		// 지점명
		private int Remaining;			// 잔여한도
		private	int successNumber;		// 성공횟수
		private	int failure; 			// 실패
		private	int residuum; 			// 잔여시도
		private	int SalesAmount; 		// 매출액
		private	int charge; 			// 충전
		private	int totalPoint; 		// 총합포인트

	// 이름 성공횟수 실패 총합포인트
	public Roulette(String name, int successNumber, int failure, int totalPoint) {
		this.Machinery = Machinery;
		this.BranchName = BranchName;
		this.charge = 0;	//충전
		this.successNumber = 0;	// 	성공횟수
		this.failure = 0;		// 	실패
		this.totalPoint = 0;	// 	총합포인트
		this.residuum =0;		// 	잔여시도
		this.SalesAmount=0;		//	매출액

	}

	public int SalesAmount() {

		System.out.println("메뉴선택 1.충전 2.게임시작 3.게임나가기");
		int input = scanner.nextInt(); // 입력하기

		if (input < 1 || input > 3) {
			System.out.println("잘못선택하셨습니다.");
			return 0;
		}

		return input;

	}

	public void charge(int money) {
//		Scanner scanner = new Scanner(System.in);
		if(Remaining >0) {
			System.out.println("충전 잔여 0원");
			return;
		}
		if(money % 1000 !=0) {
			System.out.println("1000원씩 충전가능");
			return;
		}
		int trial = (money % 1000) * 2;// 
		this.Remaining =trial; // 충전시도
		this.SalesAmount += money;
		System.out.println("충전 잔여한도 시도횟수");
	}

	// 충전 횟수 확인 메소드
	public boolean resiNotPlay() {
		if (residuum == 0) { // 잔여시도 는 0과같다
			System.out.println("남은 충전횟수가 없습니다");
			return false; // 충전 횟수가 없으면 false
		}
		return true; // 있다면 true
	}

	public boolean resiPlay() {
		if (residuum > 0) {
			System.out.println("남은 충전 횟수가 있습니다");
			return false;
		}
		return true;
	}
	// 룰렛 플레이 
	public void RoulettePlay () {	//	룰렛 메소드
		Random rand = new Random();
		while (Remaining >0) {
			int result = rand.nextInt(6) +1;
			if(result >= 1 && result <= 4) {
				successNumber++;
				System.out.println("실패 점수없음");
			}
			Remaining--;
			
		}
		
	}
	
	public void RouletteStart () {
		
	}
}

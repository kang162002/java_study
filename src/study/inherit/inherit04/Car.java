package study.inherit.inherit04;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);	//기본 타이어 
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
//	KumhoTire frontLeKumhoTire1 = new KumhoTire(null, 0);
//	KumhoTire frontLeKumhoTire2 = new KumhoTire(null, 0);
//	KumhoTire frontLeKumhoTire3 = new KumhoTire(null, 0);
//	KumhoTire frontLeKumhoTire4 = new KumhoTire(null, 0);

	

	// 생성자

	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			//똑같은 이름으로 사용하여 다양한 사용
			stop();
			return 1;	
		}
		
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

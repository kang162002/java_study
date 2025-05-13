package study.practice.practice41;

public class kitchen {
	String wallPaperColor; 			// 	벽지 색상
	double sizeArea;				// 	공간이 몇평인지
	double floorHeight; 			//	층고

}

class Refrigerator {
	String brand; 					// 	브랜드
	int manyliters;	 				// 	몇리터짜리인가
	boolean PowerOn; 				// 	전원을 켤수있다
	int doorCount; 					// 	문이 몇개인가
	double Temperature; 			// 	온도조절을 할수있나 없나 있다 Up 없다 down
	
	void PowerOn () {
		PowerOn = true;
	}
	void PowerOff () {
		PowerOn = false;
	}
	void temperatureUp () {
		System.out.println("온도를 높입니다.");
	}
	void temperatureDown () {
		System.out.println("온도를 낮춥니다.");
	}
	
}

class IceTray {
	int iceSome; 					// 	얼음트레이안에 몇구짜리인가
	int priceIce;					// 	가격

}

class GasStove {
	int nurnerCount; 				// 	화구가 몇개인가
	String brand; 					// 	브랜드
	int price; 						// 	가격
	int level; 						// 	불세기레벨

	void trunOn() {
		System.out.println("불을 켠다"); 
	}

	void trunOff() {
		System.out.println("불을 끈다");
	}

	void fireLevel() {

		System.out.println("불세기를 " + level + "로 조절");
	}
}

class Sinks {
	int width;						//	높이
	int length;						//	길이
	int depth;						//	깊이 
	String color;					//	색상
	String quality;					//	재질

}

class dunghill {
	int liter;						// 	몇리터
	String color;					//	색상
	double percentage;				//	 용량 몇퍼센트인가

	void dunghillOpen() {
		System.out.println("쓰레기통을 연다");
	}

	void dunghillClose() {
		System.out.println("쓰레기통을 닫는다");
	}
	void dunghillFill (double regulate) {
		percentage += regulate;	// 쓰레기 용량 체크
		if(percentage > 100) percentage = 100;
	}
	
	
	void dunghillVacate () {
		percentage =0;
		System.out.println("쓰레기통을 비운다");
	}

}

class cup {
	String quality;
	String color;
	int percentage;
}


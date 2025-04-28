package study.cls.Cls01;

public class Phone {

	// 필드

	String model; 	// 모델명			필수★ 	: 	
	int price; 		// 금액			선택 -> 	: 기본값 100
	int battery; 	// 배터리 용량		선택 -> 	: 기본값 3000

	//		생성자
	
	
	//		생성자 
	//		기본 생성자 : 선언된 생성자가 없을때
//		Phone () {//돌일단 매개변수를 달리하는 생성자 여러개 선언 ( 생성자 오버로딩)
			
//		}
	
	//	생성자 선언┐
		Phone (String model) {
			this(model, 100, 3000); // 내 클래스 내에 있는 다른 생성자 호출
//			this.model = model;
//			this.price = 100;
//			this.battery = 3000;
			
			
			
		}

		Phone(String model, int price){
			this(model, price, 3000);
//			this.model = model;
//			this.price = price;
//			this.battery = 3000;
			
			
			
		}
//		생성자 선언┐	매개변수
		Phone(String model, int price, int battery){	// 가장 많은 매개변수에게 적용?
			this.model = model;
			this.price = price;
			this.battery = battery;
	//		  └또다른 생성자를 호출할때
			
				//초기화 개념
			//전원확인
			//재부팅
			//필름부착
			//사용자등록
			//알콜소독 //  
			
			
		}
	
	
	//		메소드
	
}

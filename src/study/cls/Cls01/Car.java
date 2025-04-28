package study.cls.Cls01;

public class Car {
//		필드 (속성)
	String model;
	String color;	//
	int price; 
// 필드의 영역이 더 상위? 넓기때문에 아래쪽에서도 접근가능
//설계도 
	
// 		-클래스 이름과 같아야한다-
//		생성자 (기본 생성자)
	// 생성자를 작성하지 않아도, 자동으로 만들어지는 생성자

	Car() {
		System.out.println("Car() 생성자 호출됨");
		color = "회색";
	}

	//  매개 변수가┐  존재하는 생성자
	Car(String c) {// 매개채가있는 매개 변수
		System.out.println("Car(String c ) 생성자 호출됨");
		color = c; 
	}
	
	Car(String c, int p) {
		System.out.println("Car(String c, int p) 생성자 호출됨");
		color = c;
		price = p;
	}
	
	
	Car(String model, String color, int price ) {
		System.out.println("Car(int p, String m) 생성자 호출됨");
	// 지역변수로 가까운걸 인식
		this.model = model;
	//this.name 으로 지역변수가 아닌 필드변수로 변환
		this.color = color;
		this.price = price;
		
	}
	
	
//	------------------------------------- 언더바로 분류하는 스타일도있다~----------------------------------------------
//	Car(String _model, String _color, int _price ) {			
//		System.out.println("Car(int p, String m) 생성자 호출됨");	
//		model = _model;											
//		color = _color;											
//		price = _price;
//		
//	}
	//메소드 영역
	
}

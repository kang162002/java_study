package study.cls.Cls01;

public class CarMain {

	public static void main(String[] args) {
	
	// 생성자 느낌..? 마치 html의 CSS느낌
		
		Car car1 = new Car();// 생성자 실행0
		Car car2 = new Car();
		Car car3 = new Car("흰색");
		
		System.out.println(car1.color);
		System.out.println(car3.color);
		
		Car car4 = new Car("검정");
		System.out.println(car4.color);
		
		Car car5 = new Car("파랑",10000);
		System.out.println(car5.color);
		System.out.println(car5.price);
	
		car5.color = "노랑";
		car5.model = "모닝";
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		Car car6 = new Car("소나타", 250000);
		System.out.println(car6.color);
//Car 설계도를 기반으로 인스턴스 
//( 생성자를 불러오며 설계자 안에있는 필드의 color등 속성값을 가저온다.
//		car1.model 
		
	
	
		
	}

}

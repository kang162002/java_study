package study.cls.Cls02;

public class IPad {

//----------------	static	----------------//
	
	
	String owner; // IPad 소유자 
	static String brand = "Apple"; // 어디회사 브랜드인가 static 태어나기전에 
	
	
	//IPad () {
//	this.brand = "Apple"}
	
	
	void powerOn () {// 일반 매소드
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드" + brand);
		this.owner = "주인이름";
		
//		chekck();
	}
	
	
	static void check () { // static 이 있을땐 this 불가
		System.out.println(brand + "에서 만든 아이패드");
		// static 은 주체 기준이 없이 호출 - > this  특정 주체를 나타낼수 없다
//		System.out.println(owner + "의 아이패드" + brand); // static - > 인스턴스 접근X
//		System.out.println(IPad.brand + "에서 만든 아이패드");
		
	}
	
	
	
	
	
	
}

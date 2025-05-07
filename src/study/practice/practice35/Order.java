package study.practice.practice35;

public class Order {

	// 필드(인스턴스 필드)
	int orderNum;	// 가격표
	Menu[] menus;	// 메뉴 배열
	
	// 생성자
	public Order(int i, Menu[] arr) {
	orderNum = i; 	// Order에있는 정수i 변수값 저장
	menus = arr;	// Order에있는 메뉴 클래스 변수값 arr 로 저장	
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
	/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
	int sum =0;// 합계 초기화
	for (int i=0; i<menus.length; i++) {
		sum += menus[i].price;// 메뉴 
	//	합계	+= 배열값안에 메뉴를 합 한다음 sum에 저장
	}
		
		
	return sum;
	//	합계값 출력
	
	
	
	
	
	
	}	
}

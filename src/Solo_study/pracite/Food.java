package Solo_study.pracite;

public class Food {
	String name;	// 이름
	int price;		//	가격
	int stock; 		// 재고
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		stock = 5; // 음식 재고 초기화; ( 초기에 5개 재고가있다 가정)
	}
	
	public  String toString() {
		return String.format("이름: %s 가격:%d원 재고:%d개", name, price, stock);
	}
	public  String getFoodInfo() {	//	 메소드 이름은 식별하기 좋은 이름으로
		return String.format("이름: %s 가격:%d원 재고:%d개", name, price, stock);
	}
	
	// 재고 조절 (설정)하는 메소드
	
	public void setStock (int stock) {
		this.stock =stock;
	}
	
	//재고 갯수 조정
	public void modifyStock(int count) {
		//재고 3개 5개 주문 상황
		//1) 주문 불가
		//2) 최대 갯수까지만 처리
		if (stock + count < 0 ) {
			stock = 0;
		}else {
		this.stock += count;
		}
	}
	
	
	
}

package Solo_study.cls;

public class Hcls01 {

	
	/*
	 주문 번호: 202102130356

	주문자 아이디: peemang123

	주문 날짜: 2021년 02월 13일

	주문자 이름: 피망

	주문 상품 번호: PD-0345-12

	배송 주소: 서울시 관악구 123-456
	 
	 */




	//------------------------필드------------------------//



	int otherNumber;// 주문 번호
	String orderId;// 주문자 아이디
	int[] orderTade;//주문자 날짜
	String orderName;//주문자 이름
	String nameGood;
	int[] orderGood;//주문자 상품번호
	String address;//주문자 주소
	int numAddress;// 주문자 주소 번호




	//------------------------생산자------------------------//

	Hcls01 () { // 기본 생산자 만들어두기

	}

	Hcls01 (int nb, String i, int[] orderDate, String n, String g, int[] orderGood , String add, int addn) {

	this.otherNumber = nb;
	this.orderId = i;
	this.orderTade = orderDate;
	this.orderName = n;
	this.nameGood = g;
	this.orderGood = orderGood;
	this.address = add;
	this.numAddress = addn;


	}

	//------------------------메소드------------------------//

	 void order() {
	        System.out.printf("주문 번호 :%d\n 주문자 ID :%s\n 주문 날짜 :%d년 %d월 %d일\n 주문자 이름 :%s\n 주문 상품 번호 :%s-%d-%d\n 배송 주소 :%s %d\n",
	            this.otherNumber, this.orderId, this.orderTade[0], this.orderTade[1], this.orderTade[2],
	            this.orderName, this.nameGood, this.orderGood[0], this.orderGood[1], this.address, this.numAddress);
	    }



	
	
	
	
	
	
	
	
	
	
	
}

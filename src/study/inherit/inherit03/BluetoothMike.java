package study.inherit.inherit03;

public class BluetoothMike extends Mike {
	boolean isConnect;
	
	public void connect () {
		System.out.println("블루투스 연결");
	}
	//메소드 재정의(오버라이딩)
	public void volumUp () {
		System.out.println("BluetoothMike volumeUp");
		
	}
	//메소드 추가 정의 (오버로딩)
	public void volumUp(int num) {
		System.out.println(num + "만큼 volumUp");
	} 
	
	public void check () {
		System.out.println("기능 확인");
	}
//	가지고 있는 정보를 문자열로 리턴하기
	public String toString() {
		//return model + " 가격 + price + "유형:" + type + "연결여부:"+(isConnect ? '"O" ? "X");
//		String str = model + "가격" + price + " 유형 " + type + " 연결여부 " + (isConnect ? "0" : "X" );
		String str = String.format
				("%s 가격:%d 유형:%s 연결여부 : %s", model, price, type,(isConnect ? "0" : "X"));
		// to String 을 쓸때 백슬러쉬 X
		return str;
//		System.out.println(model + "가격" + price + " 유형 "
//	+ type + " 연결여부 " + (isConnect ? "0" : "X"));
//				연결여부 : false
//				연결여부 : true		
	}
}

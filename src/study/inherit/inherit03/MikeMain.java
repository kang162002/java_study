package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
// 모든 자바 클래스 ( 객체) Object 클래스를 상속받는다

		Mike m1 = new Mike();
		m1.volumUp(); // 불러오기 가능
// 		Mike 불륨업

		WirelessMike wm1 = new WirelessMike();
		wm1.volumUp();// 불러오기 가능 (자식이라 가능)
// 		Mike 불륨업

		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumUp();// BluetoothMike 불륨업
		bm1.volumUp(5);//

// 		기본형태 : 각자 개체를 가저오는건 가능 하다

		Mike m2 = new WirelessMike();
//		부모				자식
		Mike m3 = new BluetoothMike();
//		재정의 한게있다면 부를수있다 (오버라이딩)
//		m3.volumUp();//부를수있지만 볼륨업만있기에 
//		자신이 가진 볼륨업만 가지고온다.하지만 재정의한 메소드 가있다면
// 		그걸 출력
		m2.volumUp();
		m3.volumUp();
		m3.check();
//		Mike 객체에 check가있더라도 재정의한 객체로 출력 
		bm1.check(); // 객체 안에있기에 가능
		// 각 개체의 부모클래스

		// bm1.model 1차 배웠던방법
		// bm1.getModel(); 접근방법
		// bm1.printInfo(); // 2차로 배웠던 방법

//		BluetoothMike bm2 = new WirelessMike();
//		BluetoothMike bm2 = new Mike();
		// 자식이 부모객채를 가저올수없다.

		BluetoothMike bm2 = new BluetoothMike();
		bm2.isConnect = true;
		bm2.model = "성능굿마이크";
		bm2.price = 5000;
		bm2.type = "핀마이크";

		String str2 = bm2.toString();
		System.out.println(str2);

		// Mike m3 = new BluetoothMike();
		m3.check();
		System.out.println(m3.toString());

		System.out.println(m2.toString());

		// Mike m1 = new Mike();
		m1.model = "일반 마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		// 객체 자체를 출력 - > toStrin() 결과 출력
		
		Object o1 = m1;
		o1 = m2;
		o1 = m3;
		o1 = bm2;
		o1 = bm1;
		//Object변수 타입은 모든 객체타입(자식객체)을 담을수있다.
		
	}

}

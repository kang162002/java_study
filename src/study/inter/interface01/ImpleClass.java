package study.inter.interface01;



// 상속 			자식클래스 extends 부모 클래스
// 인터페이스 		구현클래스 implements 인터페이스
public class ImpleClass implements Interface01 {
	
	@Override
	public  void method1() {
		System.out.println("method1111");
	} // 추상 메소드
	//	보이진 않아도 abstract 가 붙어있다
	
	
	@Override
	public void method2() {
		System.out.println("method2222");
		
	} // 추상 메소드
} 

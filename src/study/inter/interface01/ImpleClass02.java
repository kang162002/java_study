package study.inter.interface01;

public class ImpleClass02 implements Interface01, Interface02{

	
	@Override
	public void method3() {
		System.out.println("method3333");
	}
	
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

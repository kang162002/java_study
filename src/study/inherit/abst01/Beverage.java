package study.inherit.abst01;

public abstract class Beverage {	//	음료 (추상적인 포괄적인 개념을가진 )
//	abstract 추상 클래스
	String name;
	int m1;
	
	public void intro() {
		System.out.println("저는 음료입니다");
	}
	// 추상메소드는 선언 부분만
	// 코드 실행부분 구현X
	public abstract void  checksafety();
	//안전검사
	
	public abstract void open();{
		
	}
	
}

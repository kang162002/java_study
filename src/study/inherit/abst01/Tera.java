package study.inherit.abst01;

public class Tera extends Beverage{
//	String name;
//	int m1;
	@Override
	public void checksafety() {
		System.out.println("알콜 도수 정상 체크");
	}
	@Override
	public void open() {
		System.out.println("병따개로 펑");
		
	}
		

}

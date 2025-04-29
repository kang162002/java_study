package study.cls.Cls01;

public class CalculatorMain {

	public static void main(String[] args) {

		//
		Calculator c1 = new Calculator();

		c1.brand = "카시오";

		c1.powerOn();
		// 객채에서 부른다

		Calculator c2 = new Calculator();
		c2.powerOn();

		c1.setBrightness(10);
		c1.setBrightness(8);

		c2.setBrightness(3);

//			c2.getInfo();
		String s = c2.getInfo();
		System.out.println(s);

		System.out.println(c1.getInfo());

		int result = c2.sum(10, 20);
		System.out.println(result);
		System.out.println(c2.sum(50, 80));

		int[] arr = { 1, 5, 6, 3, 45, 56 };

		int result2 = c1.sumArr(arr);
		System.out.println(result2);

		// System.out.println() 메소드 			// 파라미터 매개변수
		// void System.out.println(double) {...}
		// void System.out.println(int) {...}
		
		//선언부	: 	리턴타입,메소드 이름, 매개변수선언 ( void , int, String, 등등
		//void	:	리턴값이 없는 메소드
		//매개변수	:	메소드 호출시 
		//리턴문	:	메소드 리턴값 지정
		
		
		
	}

}

package study.cls.cls03.pack1;

import java.util.Scanner;

import study.cls.cls03.pack2.Cup;
// 하위 패키지 마지막에 * 를 넣으면 모든 하위패키지를 가저오겠다  
// 상단에 import하면
// 본 페이지에서 Cup 클래스 사용시 import한 클래스로 인식
public class CupMain {

	public static void main(String[] args) {

		//상단에 import 가 없으면, 동일 패키지 클래스 인식
		Cup c1 =new Cup ();
		
		c1.method();

		study.cls.cls03.pack2.Cup c2 = new study.cls.cls03.pack2.Cup();
		// import 안걸었을시 예시)
		c2.method();
		//pack2.Cup c2 =new pack1.Cup();
		
		Scanner scanner = new java.util.Scanner(System.in);
		//import 가없을시
		//import 가있을대 패키지2를쓰다 1을 쓰기위해선 
		study.cls.cls03.pack1.Cup c3 =new study.cls.cls03.pack1.Cup();
		//를 써야한다
		c3.method();
		
		
//		c2.b
//		c3.a
//		c3.b
		
		
	}

}

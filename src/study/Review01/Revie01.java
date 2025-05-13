package study.Review01;

import javax.lang.model.element.NestingKind;

public class Revie01 {

	public static void main(String[] args) {
		
		//변수
		
		
		//데이터(값)저장하는공간
		
		/*
			int		: 정수형	12345 소수점없는 그냥 숫자
			double	: 실수형 (소수점)
			boolean	: 논리형 ( true/false )
			String  : 문자형  "문자"
		
		*/
			int age = 10;  
		//  정수	변수	   값
		
			System.out.println(age);  	// 내용 출력후 줄바꿈
			System.out.print(age);		// 내용 출력만하고 줄바꿈X
			System.out.printf("내 나이는 %d살 입니다", age); 	// 특정 형식에 맞춰
							// 정수 %d 실수 %f 문자열 %s 
							//	\n 줄 바꿈(엔터)
			String weather = "맑음"; // 자바 문자열 표현 "문자열" 따옴표로 감싼다
			
			System.out.println("오늘의 날씨는 " + weather);
			System.out.print("오늘의 날씨는 " + weather);
			System.out.println(); // \n대신 System.out.println(); 으로 줄바꿈을 대신쓸수있다.
			System.out.printf("오늘의 날씨는 %s\n", weather);
			
			// boolean 타입
			
			boolean tired = true; // true /fasle 참/거짓
			
			System.out.println(tired);
			tired = false;
			
			int n1 = 10;
			int n2 = 20;
			//n1 + n2 ;// 등 더하기 가능
			int n3 = n1 + n1 * n1 + n1 +n1 ;
			System.out.println(n1 + n2 ); //합을 보여줌
			// + 연산 숫자와 문자열 만나면 - > 그냥 앞뒤로 이어붙이기됨
			//n1+ "20"    결과 : 1020
			
			int total = 3;
			total = total +2;
			total = total +5;
			//변수 합산
			
			String name = "가나다"; //등등  하나씩 적을수있다.
			String name1 = "가나다"; 
			String name2 = "가나다"; 
			String name3 = "가나다"; 
			String name4 = "가나다"; 
			
			//배열 :  같은 타입의 데이터 여러개를 붙여서 한번에 관리 저장 공간
			String[] names= {"가",};
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}						

}

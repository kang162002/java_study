package study.refer;

import java.util.Scanner;

public class Refernce01 {

	public static void main(String[] args) {
		
		//  참조변수
		/*
		 null 아무거도없는 상태 (가르키는게 없다)
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = "아침";
		String str2 = "아침";  // String 값을 비교할때는 equals 사용추천  (문자열을 비교할때)
		String str3 = scanner.next();
		
		// 참조변수에서  == 비교는 값 비교가 아니라 참조하는 주소가 같은지 비교하는 것
		System.out.println(str1 == str2);	// 스택 	Stack 
		System.out.println(str2 == str3); 	// 힙 	Heap
		System.out.println(str3.equals(str2));
		System.out.println(str2.equals(str3)); 
		// String 값을 비교할때는 equals 를 쓰자 
		
		//null  
		
		int num;
		int sum = 0;
		
		//num = num +10; //저장값이없다
		sum = sum +10; // 계산가능
//		System.out.println(num);
		System.out.println(sum);
		
		String s1;
		String s2 = null; // 참조하는게 없다 = null  > // NullPointerException  실행할 경우 
		String s3 = "글자";
							
//		System.out.println(s1);
		System.out.println(s2); // 비어있는 값 null (출력입력시 null로 나옴)
		System.out.println(s3);
		
		if (s2 != null) // 비교용으로 가능
		System.out.println(s2.equals("글자"));
		
		
		
		
		
		
		
	}

}

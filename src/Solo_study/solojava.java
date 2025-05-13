package Solo_study;

import java.util.Scanner;

public class solojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	int a = 2;
	
	if ( a < 1 ) {
		
	}else if(a < 2 ){
		
	}else if(a < 3 ){
		
	}else {
		System.out.println("크다");
	}
	
	
		
		//	년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요.
		//			%4		%100	%400	윤년
		//	2020	O		X		X		O
		//	2021	X		X		X		X
		//	2024	O		X		X		O
		//	2100	O		O		X		X
		//	2200	O		O		O		O
		//	2000	O		O		O		O
	
	
	
//	Scanner scanner = new Scanner(System.in);
//	
//	int year = scanner.nextInt();
//	
//	if (year %4 == 0 ) {
//		if (year % 100 == 0) {
//			if(year % 400 == 0) {
//				System.out.println("윤년4 O");//  
//			}else {
//				System.out.println("윤년3 X");// 
//			}
//		}else {
//			System.out.println("윤년2 O"); //  
//		}
//	}else {
//		System.out.println("윤년1 X");  //
//	}
//	
	
	
	
	int x = 10;
	int y = 10;
	
	System.out.println(x++ + y++);  // 증가값 1이 밀려 다음 계산에 나타남
	System.out.println(++x + ++y ); 
	System.out.println(x);
	System.out.println(y);
	System.out.println(y--);  // 증가값및 감소값 뒤로가면 출력은 원래 숫자 다음 출력에 감소값이 나옴
	System.out.println(y);
	
	x = 5;
	y = 5;  // 값 초기화
	
	System.out.println(++y + "Y");  // 증가값 앞에 있어 먼저 계산된값 6출력
	System.out.println(x + "X" );
	System.out.println(y++ + x++ + "Y X 합"); // 후위 증강자로인해 출력값 11나옴 
	System.out.println(y); // 후위증강자로인해 7로 출력 
	
		
		
	}

}

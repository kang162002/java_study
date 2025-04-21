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
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	int year = scanner.nextInt();
	
	if (year %4 == 0 ) {
		if (year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.println("윤년4 O");//  
			}else {
				System.out.println("윤년3 X");// 
			}
		}else {
			System.out.println("윤년2 O"); //  
		}
	}else {
		System.out.println("윤년1 X");  //
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}

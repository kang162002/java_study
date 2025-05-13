package study.practice;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		
			prac1 ();
			//prac2 ();
			//prac3 ();
		
	}

	public static void prac1 () {
					
//		System.out.println("입력" );
//		System.out.println("수정" );
//		System.out.println("조회" );
//		System.out.println("삭제" );
//		System.out.println("종료" );
//		System.out.println("");
		
		// String 배열을 을 이용한 방법 첫번째 방법
		
		String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
				// 5
		for (int i=0; i<menuArr.length; i++) { // i: 0 1 2 3 4
			System.out.println((i+1) + ". " + menuArr[i]);
			// i:0				0+1;			menuArr[0]
			//					1. 입력			
			//					2. 수정
		}
		
		
		//  두번째 방법
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴번호를 입력하세요 :");
		int menu =scanner.nextInt();
		
		if (menu >= 1 && menu <= 4) {
			System.out.println(menuArr[menu-1]+ " 메뉴입니다. ");
		}else if (menu ==5) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
//		if (number >=1 && number <= 1 ) {
//			System.out.println("입력 메뉴입니다.");
//		}else if (number >= 1 && number <= 2 ) {
//			System.out.println("수정 메뉴입니다." );
//		}else if (number >= 1 && number <= 3 ) {
//			System.out.println("조회 메뉴입니다.");
//		}else if (number >=1 && number <= 4 ) {
//			System.out.println("삭제 메뉴입니다.");
//		}else if (number >=1 && number <= 5 ) {
//			System.out.println("프로그램이 종료됩니다.");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//switch 를 이용한
		
//		switch(menu) {
//		case 1 :
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2 :
//			System.out.println("수정 메뉴입니다." );
//			break;
//		case 3 :
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4 :
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 5 :
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다.");
//		}
//	
		
		
	}
	public static void prac2 () {
		
		
		
		Scanner scanner = new Scanner(System.in);
//		
//		
//		
//	
			
		 for (int x=0; x <= 10; x++){
		      for (int y=0; y <= 10; y++){
		        if(((2*x)+(4*y))==10){
		       int num= scanner.nextInt();
		     System.out.println(y+x);
		        }
		      }
		
		
		      
		 }  
	}
	public static void prac3() {
		 //		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		 //		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		 //		1   2   3   4
		 //		5   6   7   8
		 //		9  10 11 12
		 //		13 14 15 16
		 		
		 		//arr[4][4]
		 		
		 		//int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		 		int[][] arr = new int[4][4];
		 		
		 		int num = 1;
		 		for(int i=0; i<arr.length; i++) {
		 			for(int j=0; j<arr[i].length; j++) {
		 //				arr[i][j] = num;	
		 //				num++;	
		 				//i: 0		 1		 2 
		 				//j: 0 1 2 3 0 1 2 3 0 1  2  3  ...
		 				//n: 1 2 3 4 5 6 7 8 9 10 11 12 ...
		 				arr[i][j] = (4*i) + (j+1);
		 			}
		 		}
		 		
		 		
		 		for(int i=0; i<arr.length; i++) {	//i : 0 1 2 3   행 인덱스
		 			for(int j=0; j<arr[i].length; j++) {
		 				//System.out.print(arr[i][j] + " ");
		 				System.out.printf("%3d", arr[i][j]);
		 			}
		 			System.out.println();
		 		}
		 	}
}
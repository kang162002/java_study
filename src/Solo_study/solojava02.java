package Solo_study;

import java.util.Scanner;

public class solojava02 {

	public static void main(String[] args) {

		
		
		
//		
//		Scanner scanner = new Scanner(System.in);
//
//		int num = scanner.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		int i=1;
//		while(i<=num) {
//			System.out.print("*");
//			i++;
//		}
//		
		// while 문을 이용한 방법
	/*	
		int i=0;
		int sum = 0;
		int sum2 = 0; // 합의 합을 구하는 값
		
		while (i<=10) {
			sum = sum+ i;
	//		0	   0 + 0
			sum2 = sum2 + sum;
	//   	 0   =   0  +  0
			i++;
		}
		System.out.println(sum2);
		*/
		
	// =========================================================//
		
		
		
		// for 반복문으로 만드는  100이상 결과값 만들기 하나
		/*
		int num = 0;
		
		for (int j=1; j<=10; j++) {
			for(int i=0; i<=j; i++) {
				num = num + i;
			}
		}
		System.out.println("합계 :"+num);
		
		
		int sum =0;
		int sum2 =0;
		int a = 0;
		
		for (a =1; a<=10; a ++) {
			sum = sum + a; 		// 누적 합 1 +2+3+4+...
			sum2 = sum2+sum;  	// 누적합의 누적합 
		}
		System.out.println("합계 :" + sum2);
		*/
		
		/*
		int[][] intArr = new int[5][4];
		
		int num = 1;
		for (int a = 0; a <= intArr.length; a++) {
			for(int b = 0; b<=intArr[a].length; b++) {
				intArr[a][b] = num++;
			}
			
		}
		*/
		
		

	}

}

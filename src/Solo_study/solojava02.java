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
			sum = sum + a;
			sum2 = sum2+sum;
		}
		System.out.println("합계 :" + sum2);
		
		
		
		
		
		
		

	}

}

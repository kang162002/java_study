package study.practice;

import java.util.Scanner;

public class practice13 {

	public static void main(String[] args) {


		/*
		 
			1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
			
			2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
			
			3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
			
			4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
			ex) 입력 : 10
			결과 : **********
			
			5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
			ex) 1 - 2 + 3 - 4 .....
			
			6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
			1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
			
			7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
			ex) 입력 3
			3 * 1 = 3
			3 * 2 = 6
			3 * 3 = 9
			...
			3 * 9 = 27
		 
		 */
		
		parac1();
		//parac2();
		//parac3();
		//parac4();
		parac5();
		//parac6();
		//parac7();
		
	}
	
	public static void parac1 () {
		//1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		 
		int num =scanner.nextInt();
		
		if( num % 2 == 0) { // 짝수
			System.out.println("enven");
		}else {   	// 홀수
			System.out.println("odd");
			}
		
//		System.out.println((num%2==0) ? "even"  : "odd");  //한줄로 가능	
		}
	
	
	public static void parac2 () {
		// 2. 정수를 입력받고 7의 배수면 "7의 배수입니다" ,출력, 아니면 "아닙니다" 출력,
		
		Scanner scanner =new Scanner(System.in); 
		System.out.print("정수 입력 : ");
		int num =scanner.nextInt();
		
		
		if( num % 7 == 0) { // 7의 배수 입력값
			System.out.println("7의 배수입니다");
		}else {   // 아니다 
			System.out.println("아닙니다");
			
			}
		
		
		
//		System.out.println((num%2==0) ? "even"  : "odd");  //한줄로 가능
//		
		
		
	}
	
	public static void parac3 () {
		
		// 3.  1~ 1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		// %5 == 0 의 배수
		
		int sum =0;
		for (int i = 1; i<= 1000; i++) { // 1~ 1000
			
			if(i%5 ==0 ) { // 5의 배수다
				//5의 배수를 누적 합 계산 ++
				sum = sum +i;
			}
			
		}
		System.out.println("1~1000까지 5의 배수의 합 : " +  sum);
		
		sum =0;
		for (int i=5; i<=1000; i=i+5) {
			sum =sum +i;
		}
		System.out.println("1~1000까지 5의 배수의 합 :" + sum);
	}
	
	public static void parac4 () {
		
		/*
			4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
			ex) 입력 : 10
			결과 : **********
		 */
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("1~ 50까지의 수를 입력 : ");
		int num = scanner.nextInt();
		 
		 
		 //for (초기화; 조건식; 증감식)
		 //실행문
//		 if(num >= && num <= 50) {// 1~50까지 수를 입력한 정상
			 
		 
		 for (int i=1; i<=num; i++) {
			 System.out.print("*");
		 }
		}

	
	public static void parac5 () {
		// 5. 1~10 까지의 수에서 홀수면 더하기 (+), 짝수면 빼기(-)를 수행해서 최종결과 출력,
		
		int sum = 0;
		for (int i =1; i<=10; i++) {
			if (i%2 ==0) {
				sum = sum - i;
			}else { // 홀수
				sum = sum +i;
			}
		}
		System.out.println("계산 결과 =" + sum);
	}
	
	public static void parac6 () {
		// 6번 . 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		//1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		
//		for (int i=1; i<=1000; i ++) {}
		int i =1; //1 로 맞춰줌
		int sum =0; // 정수 초기화
		while (sum < 1000) {  // 1000에서 멈추도록 
			//더하기
			sum = sum + i;  //  +1 +2 +3 ... 더하기
			i++; // i에  +1을 추가한다
		}
		System.out.println("1000이 넘는 누적합 :" + sum);
		
		i=1;	// i의 값이1 
		sum=0;		// sum 의 값은 0
		while (true) {		// 진실
			sum = sum + i;  // sum +i 를 더한값을 sum 에 저장
			i++;	// i++로 1을 더해 위로 반복
			
			if (sum >= 1000) {
				break;
			}
		}
		
	}
	
	public static void parac7 () {
		
		/*
		 	7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
			ex) 입력 3
			3 * 1 = 3
			3 * 2 = 6
			3 * 3 = 9
			...
			3 * 9 = 27
		 */
		Scanner scanner =new Scanner(System.in);
		System.out.print("구구단 몇단? :");
		int num = scanner.nextInt();
		
//		
//			for (int i= 1; i<=9; i++) {
//				System.out.println("** " + i + "단 **");
//				for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "X" + j + "=" + (i*j));
//				}
//			}
		
		if(num >=1 && num <=9) { // 1~9인 경우만 구구단 출력
			
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
		
	}

}
	
package study.practice;

import java.util.Random;
import java.util.Scanner;

public class practice24 {

	public static void main(String[] args) {
	
		 	//prca1();
			//prca2();
			//prca3();
			//prca4();
			//prca5v1();
			//prca5v2();
			//prca6();
		
	}
	
	public static void prca1 () {
		
		/*
		 1.
			두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
			모든 경우의 수를 출력하는 프로그램을 작성하시오.
			
			1 2 3 4 5 6  값 주사위 두개
			
			
			첫번째 주사위 값 : x 
			두번째 주사위 값 : y
			x + y =6
			
		 */
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if (x + y == 6) {
					System.out.println("X:" + x + "Y:" + y);    
				}
			}
		}
		
		
}
	
	public static void prca2() {
		Scanner scanner = new Scanner(System.in);

		/*
		 * 
		  	우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다. 반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며, 각 반별
		  	점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오. (*가능한 효율적인 구조를 생각해보세요)
		  
		 	ex) 1반 : 10 10 10 10 10 2반 : 20 20 20 20 20 3반 : 30 30 30 30 30
		  
		  	1반 평균 : 10 2반 평균 : 20 3반 평균 : 30 전체 평균 : 20
		  
		  
		  
		 */

		int[][] scores = new int[3][5];
		
		/*	ㅁ ㅁ ㅁ ㅁ ㅁ   
		  	ㅁ ㅁ ㅁ ㅁ ㅁ 
		  	ㅁ ㅁ ㅁ ㅁ ㅁ
		*/
		//반별 1차원 배열
		
		int[] scores1 = new int [5];
		int[] scores2 = new int [5];
		int[] scores3 = new int [5];
		
		
		System.out.print("1반 : ");
		for ( int i=0; i<scores1.length; i++)
		{
		scores1[i] =scanner.nextInt();
		}
		
		System.out.print("2반 : ");
		for ( int i=0; i<scores2.length; i++)
		{
		scores2[i] =scanner.nextInt();
		}
		
		System.out.print("3반 : ");
		for ( int i=0; i<scores3.length; i++)
		{
		scores3[i] =scanner.nextInt();
		}
		
		
		int[] totals = new int [3];
		
//		int total1
//		int total2
//		int total3
		// 0 : 1반		
		// 1 : 2반
		// 2 : 3반
		
		for (int i=0; i<scores1.length; i++) {
			totals[0] = totals[0] + scores1[i];
		}
		for (int i=0; i<scores1.length; i++) {
			totals[1] = totals[1] + scores2[i];
		}
		for (int i=0; i<scores1.length; i++) {
			totals[2] = totals[2] + scores3[i];
		}
		System.out.printf("1반 평균 : %.2f\n",totals[0] / 5.0);
		System.out.printf("2반 평균 : %.2f\n",totals[1] / 5.0);
		System.out.printf("3반 평균 : %.2f\n",totals[2] / 5.0);
		System.out.printf("전체 평균 : %.2f\n",(totals[0] + totals[1] + totals[2]) / 15.0);
		
		// 한번에 
//		for(int i=0; i<5; i++) {
//			totals[0] = totals[0] + scores1[i];
//			totals[1] = totals[1] + scores2[i];
//			totals[2] = totals[2] + scores3[i];
			
}
	public static void prca3() {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[][] scores =new int[3][5];
		
		for (int i=0; i<scores.length; i++) {
			System.out.println((i+1) + "반 : ");
			
			for (int j=0; j<scores[i].length; j++) {
				scores[i][j] = scanner.nextInt();
				
			}
	
			
		}
		
		int total = 0;  //전체 총합
		int classtotal = 0; //  한반의 총합
		for(int i=0; i<scores.length; i++) {  // u : 0 1 2
			
			classtotal = 0;
			
			for (int j=0; j<scores[i].length; j++) { // j : 0 1 2 3 4 
				classtotal = classtotal + scores[i][j];
			}
			
			System.out.printf("%d반 평균 : %.2f\n", (i+1), classtotal /5.0);
			total += classtotal;
		}
		System.out.printf("전체 평균 : %.2f\n",total/15.0);
		
		
		
	
		
		
				
		
		
		
		
}
	public static void prca4() {
		//랜덤값 생성
		
//		Random random = new Random();
		
//		System.out.println(random.nextInt(5)); // 0 1 2 3 4 
//		System.out.println(random.nextInt(1,5)); // 1 2 3 4  1<=랜덤값 <5
		
		// 1 ~ 6 뽑는방법
//		System.out.println(random.nextInt(6) + 1);
		
//		Math.random();
//		System.out.println(  (int)(Math.random() * 6)  + 1);
		// Math.Random 이 뽑아주는 랜덤으로부터 뽑아낼수있는 값은  0.0 부터 0.999....까지 뽑을수있다.
		
		
		// 1 ~ 6  (int)Math.random() * 6) + 1;
		// 40 ~ 60 (int)Math.random() * 21) + 40
		// (Math.Random() * 숫자의 객수) + 시작 숫자
		
		/*
			 2.
			로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
			최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
			로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
			1) Math.random() 활용
			2) int[] lotto = new int[6]; 활용
	
		*/
		

		int[] lotArr = new int[6];

		for (int i = 0; i < lotArr.length; i++) { // 배열값 저장
			int num = (int) (Math.random() * 45) + 1; // num 으로 랜덤 번호 저장
			lotArr[i] = num;				// 랜덤번호 저장한 num을 다시 배열값으로 저장
			for (int j = 0; j < i; j++) { 	// J값은0 J보다 작거나 크다 i 
				if (lotArr[i] == lotArr[j]){ // 배열i 와 배열J의값은 동등 
					i--;
					break;
				}

			}
			System.out.print(lotArr[i]+ " ");
		}
		
		for( int i = 0; i<6; i++) {
			lotArr[i] = (int)(Math.random()* 45)+1;
		}
		// 6개 뽑힌 번호 출력
		for (int i=0; i<6; i++) {
			System.out.print(lotArr[i]+ " ");
		}
		
	
	
		
}
	public static void prca5v1() {
		
int[] lotto = new int[6];	// 로또 6개 값 저장용 배열변수
		

	
	int num; //뽑은 숫자 임시 저장
	int index = 0; //배열의 위치를 나타내는 인덱스
	boolean isDuplicated = false;

	// 6개의 로또번호 뽑는 과정
	for(int i=0; i<6; i++) {
		//i: 2
		lotto[i] = (int)(Math.random() * 45) + 1 ;
		
		for(int j=0; j<i; j++) {
			if(lotto[i] == lotto[j]) {
				i--;
				break;
			}
		}
	}
	
	// 6개 뽑힌 번호 출력
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}
	
	
		
	}
	public static void prca5v2() {
		
		
		Random random = new Random();
		
		
		int[] lotto = new int[6]; 
		
		int num;
		
		int index =0;
		
		boolean isDuplicated =false;
			
		for (int i=0; i<6; i++) {
			// i :
			lotto[i] =(int)(Math.random()*45) +1;
			
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				
				}
			}
		}
		
		int count = 0;
		
		for (int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		
		}	
		System.out.println();
		
	}	
	public static void prca6() {
		
	/*
	 4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
		
		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270	
	 */
	
		
		
		int[][] arr =  {
			{10, 20, 30},
			{20, 30, 40},
			{30, 40, 50}
			};
		int[][] result = new int [4][4];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				result[i][j] = arr[i][j]; 	// 같은 인덱스 위치 복사
				result[i][3] += arr[i][j];	//행의 마지막 더하기 result[i][result[i].length -1] // 
 				result[3][j] += arr[i][j]; 	//열의 마지막 행에 더하기
 				result[3][3] += arr[i][j]; 	// 마지막 행 마지막 열에 더하기	
			}
		}

		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				System.out.printf("%4d\t",result[i][j]);
				}
			System.out.println();
			}
			
		
		/*		→
		 		0		1		2		3
		 	
		 ↓	0	10		30		40		10+20+30
		 	  [0][0]	
		 	1	20		40		40		90
		 
		 	2	30		40		50		120
		 
		 	3	30		40		120		270
		 
		 */
		
		
		
		
		
		
		
		
		
		
	}
		
	
}



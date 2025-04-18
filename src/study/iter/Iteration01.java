package study.iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
		System.out.println("안녕하세요~");
		
		// 			반복문 	
		/*
			 for (조기화; 조건식; 증강식) {
			 }
		 */
		
		// 보통 쓰는방법
//		System.out.println("========== for문 ==========");
//		for (int i=1; i<=5; i++) {
//			System.out.println("안녕하세요~");
//			
//		}
//		
//		// i : 1~10 <= 10 - > 10번 반복
//		
//		
//		
//		// 조건식 : i < 15 -> 14번 반복
//					
//		// i : 1 ~ 14 -> 14번
//		
//		// 단순 몇회 반복 용도
//		int i = 1;
//		
//		for ( i=7; i != 13; i=i+1) {
//		//			참/거짓
//			System.out.println("반갑습니다.");
//		//
//		}
		
		
		// 실제 반복되는 값을 실행에 활용하는 용도
		
		// 1 ~ 7일 동안 반복 학습 출력 
		
//		System.out.println("자바 복습 1일차");
//		System.out.println("자바 복습 2일차");
//		System.out.println("자바 복습 3일차");
//		System.out.println("자바 복습 4일차");
//		System.out.println("자바 복습 5일차");
//		System.out.println("자바 복습 6일차");
//		System.out.println("자바 복습 7일차");
		
		// 7번 반복 -> 11 ~ 17  101~ 107
//		System.out.println("==============================");
//		for (int j=1 ; j <= 7; j++) {
			// j: 1~7
//			System.out.println("자바 복습 " + j + "일차");
//		}
	
		// 1~ 50 까지 합
//		 int num = 1 + 2 + 3 + 4 + 5 + 6 + .......
		
		int num = 0;  // 초기값을 0으로 줘서 더하기 또는 빼기 등을 할때 변수 차단 //
		
		for (int k = 1; k<=50; k++) {
		//  	k가 50보다 작거나 같거나
			num = num + k;   //더하기 빼기 나누기등 바꾸는 값
			// num += k;
		}
		System.out.println("1 ~ 50까지의 합 : " + num);
		
		for (int v = 1; v <= 153; v++) {
			num = num + v;
		}
		System.out.println("1~153합 : " + num);
		
		
		//k : 2
		// k < 20 
//		for (int k=2; k<20; k=k*2) {
//			System.out.println(k);
			//1번 int k = 2 
			//2번 k<20
			//3번 k=k*2   
			
//		}
		
//		for (int k=400; k>100; k=k -50) {
//			System.out.print(k + " ");
			
			//400 350 300 250 200 150 .....
//		}
		//k : 100
		// 	K >= 90
		
//		System.out.println("\n");
//		for (int k = 100; k>=90; k--) {
//			System.out.print(k+ " ");
			// 100 99 98 97 
//		}
		
		
		for (int d = 1; d <= 111; d++) {
			num = num + d;
		}	// 마지막 + 변수갑 결론
		System.out.println("111합 : " + num);   //
		
		
	}

}

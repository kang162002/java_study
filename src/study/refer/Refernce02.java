package study.refer;

import java.awt.Scrollbar;

public class Refernce02 {

	public static void main(String[] args) {
		// 참조변수 : 배열 
		
		// 배열이 없다면 (참고
				
//		int score1 = 100;
//		int score2 = 85;
//		int score3 = 75;
//		int score4 = 65;
//		int score5 = 40;
//		
//		int sum =0;
		
//		sum = score1 + score2 + score3 + score4 + score5 ;
//		double avg =sum / 5.0;
//		System.out.printf("총점 : %d 평균:%.2f\n", sum, avg);
//	}

	// 	같은 타입끼리 모아주는 배열 변수
			
		//배열 
		
		// int (정수형) 대이터를 가지는 배열 생성
		//scoreArr scorearray scores 등 적는 이유는 북수형으로 알기쉽게 
		
		
		// 참존변수           0	1	2	3	4 
//		int[] scoreArr = {100, 85, 75, 65, 40}; // 5개 정수를 가진 배열
//		
//		System.out.println(scoreArr[0]);
//		System.out.println(scoreArr[3]);
//		System.out.println(scoreArr[4]);
//		System.out.println(scoreArr[5]); // index 범위 주의 ( 벗어나서 쓰면 오류 ) 
//		
//		sum = scoreArr[0]+scoreArr[1]+scoreArr[2] + scoreArr[3] + scoreArr [4]; 
//		avg = sum /5.0;
//		System.out.printf("총점:%d 평균:%.2f\n",sum, avg);
		
//		sum = 0; //계산할 값 입력
//		for (int i=0; i<5; i++) { // i : 0 1 2 3 4 까지 출력
//			sum = sum + scoreArr[i];
//			//			scoreArr[1]
//			//					 1 2 3 4 5 순서대로 나오며 계산
//				
//			avg = sum / 5.0;
//			System.out.println(sum);
//		}
		
//			int[] pointArr = {1,2,3,4,5};  // 사용가능
//			int[] pointArr = null; 
//			//pointArr = {1,2,3,4,5}; X불가능
//			pointArr = new int[] {1,2,3,4,5}; // 사용가능 O
//			
//			pointArr = new int[5]; //5칸짜리 배열 생성
//			pointArr[0] = 1;
//			pointArr[1] = 2;
//			pointArr[2] = 3;
//			pointArr[3] = 4;
//			pointArr[4] = 5;
//			
//			for (int i=0; i<5; i++) {
//				//i : 0 1 2 3 4  로 바뀜
//				//값 :  0 1 2 3 4 5
//				pointArr[i] = i+1;
//			}
//			
//			for (int i=1; i<=5; i++) {
//				// 	 i : 1 2 3 4 5
//			//index	 i : 0 1 2 3 4 i+1
//				pointArr[i-1] = i;
//			}
			
			int[] intArr = new int[6];
			double[] doubleArr = new double[12];
			boolean[] boolArr =new boolean[4];
			String[] strArr = new String[20];
			
			intArr[3] = 9;			//0
			doubleArr[9] = 11.11; 	//0
			boolArr[3] =true; 		//false
			strArr[15] = "점심"; 		//null
//						length 8이 들어온다 // 배율의 길이만큼 바뀐다 intArr 10 ->  i<intArr.length 가 10으로 바뀜
			for(	int i=0; i<intArr.length; i++	) {
				System.out.print(intArr[i] + "");
			}
			System.out.println();
			
			for(	int i=0; i<doubleArr.length; i++	) {
				System.out.print(doubleArr[i] + "");
			}
			System.out.println();
			
			for(	int i=0; i<boolArr.length; i++	) {
				System.out.print(boolArr[i] + "");
			}
			System.out.println();
			
			for(	int i=0; i<strArr.length; i++	) {
				System.out.print(strArr[i] + "");
			}
			System.out.println();
			
		}
}


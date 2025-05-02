package study.practice.practice31;

import java.util.Scanner;

public class diet {

	public static void main(String[] args) {
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		double start = scan.nextDouble();	// 현재 몸무게
		int after = scan.nextInt();			// 몇달 후 몸무게

		// 계산
		double result = weight(start, after);
		//				몸무게	
		// 결과 출력
		System.out.printf("%d개월 후 예상 몸무게 => %fkg", after, result);
		}

		// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
		public static double weight(double currentWeight, int months) {
								//			
		double expectedWeight = currentWeight;
			//	예상 몸무게?			몸무게
		for (int i=1; i<=months; i++) {
			expectedWeight += 0.231; // 1달에 0.231kg 살찐다
		}
		return expectedWeight;
	}

}

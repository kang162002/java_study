package study.practice;

import java.util.Scanner;

public class practice25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * 학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다. 이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을
		 * 작성하세요.
		 * 
		 * int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		 * 
		 * 최고 점수와 최저 점수를 출력하세요. 평균 점수를 출력하세요. 80점 이상인 학생의 수를 출력하세요.
		 * 
		 * 출력 예)
		 * 
		 * 최고 점수: 100 최저 점수: 63 평균 점수: 82.5 80점 이상 학생 수: 6명
		 * 
		 */

		int[] scores = { 88, 92, 75, 63, 95, 70, 85, 90, 100, 67 };
		//

		// max
		// min 값을 미리 정해둔다
		
		
		//최고 점수 찾기
	/*
		int max = scores[0]; 
		// 값 비교를 위해 아주 작은 0을 입력하거나 가장 값의 가장 처음 위치를 입력한다
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max ) { 
				// 지금까지의 최대값인 max보다 배열에 있는 값이 더크다
				// 더 큰 값 찾음
				max =scores[i];
			}
		}
		
		//최소값
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < min ) { // 최대값 max와 반대로 최소값 min
				min = scores[i]; 
			}
		}
		// 더한값
		int sum =0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum +scores[i]; // 모두를 더한 값
		}
		double avg = (double)sum/scores.length; // 소수점 나누기위해 더블입력
		
		int count =0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 80) {
				count += 1;
			}
		}
		System.out.printf("최고 점수 : %d\n", max);
		System.out.printf("최저 점수 : %d\n", min);
		System.out.printf("평균 점수 : %.2f\n", avg);
		System.out.printf("80점 이상 학생 수 : %d명\n", count);
	*/
		
		
		// 합처서 간단하게 만들기 
		
		
		int sum =0;
		int count =0;
		int min = scores[0];
		int max = scores[0]; 
		// 값 비교를 위해 아주 작은 0을 입력하거나 가장 값의 가장 처음 위치를 입력한다
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max ) { 
				// 지금까지의 최대값인 max보다 배열에 있는 값이 더크다
				// 더 큰 값 찾음
				max =scores[i];
			}
				
			if(scores[i] < min ) { // 최대값 max와 반대로 최소값 min
					min = scores[i];
			}
				sum = sum +scores[i];
			if (scores[i] >= 80) {
				count += 1;
			
			}
		}
		
		double avg = (double)sum/scores.length; // 소수점 나누기위해 더블입력
		
		
		System.out.printf("최고 점수 : %d\n", max);
		System.out.printf("최저 점수 : %d\n", min);
		System.out.printf("평균 점수 : %.2f\n", avg);
		System.out.printf("80점 이상 학생 수 : %d명\n", count);
		
	}

}

package study.practice.practice32;

import java.util.Arrays;
import java.util.List;

public class TopScoreStudent {

	public static void main(String[] args) {
		
		// 배열 생성
		String[] names = {"Elena","Suzie","John","Emily",
				"Neda","Kate","Alex","Daniel","Hamilton"};	// 이름을 배열로 만드세요
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54}; // 점수를 배열로 만드세요 
					//	0	1	2	3	4	5	6	7	8
		
		// 1등 인덱스 검색
		int i = topIndex(scores);
		
		
		
		

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		}

		// 정수형 배열을 입력받아 가장 큰 값의 index를 반환
		public static int topIndex(int[] arr) {
			int maxindex = 0;	//	maxindex 로 0번이 최고라고 설정
			for (int i=0; i<arr.length; i++) {
				if ( arr[i] > arr[maxindex]) {	// 탑 index 에 arr 배열
					maxindex = i;
				}
			}
			//	arr 배열에 있는 가장 큰 점수의 index 값
			
			/*  arr 배열에 있는 가장 큰 점수의 index 값
			 * 	
			 	int max = arr [0];
			 	int miaxIndex =0;
			 	for (int i=0; i< arr.length; i++ ) {
			 		if (arr[i] > max ) {
					max =arr[i]
					maxIndex = 1;
				}
			}
			// 다른방식
			
			 	int miaxIndex =0;
			 	for (int i=0; i< arr.length; i++ ) {
			 		if (arr[i] > max ) {
					max =arr[i]
					maxIndex = 1;
			
			
			
			*/
		return maxindex;
		

	}

}

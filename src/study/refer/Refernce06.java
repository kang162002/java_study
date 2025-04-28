package study.refer;

public class Refernce06 {

	public static void main(String[] args) {
	
		//index값 3 : 1  2  3  
		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			//sum += i; 는 // 0 1 2 3 4 5 이런식으로 더해지게된다
			sum += arr[i]; // 10 20 30 40 50
		}
		
		System.out.println(sum);
		
		sum = 0;
		int index =0; // 따로 index를 만들어서 
		for (int num : arr ) { // num 변수에 배열의 값이 매핑
			sum += num; 
			
			index++;
			if(index >=3) 
				break;
			//arr 의 길이만큼 처음부터 끝까지 다 반복
			//값 만 주어짐,  index는 모름 (필요하면 따로 처리해야한다)
			
		}
		System.out.println(sum);
		
		int[] scores = {90, 95, 100, 80, 70}; // 점수
		
		// 채점 실수로 모두 -5 점 처리
		
		for (int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		for (int score : scores) {
				score = score -5;
		}
		
		for (int i=0; i<scores.length; i++) {
			scores[i] = scores[i] -5;		// 배열의 주소에 접근
		}
		
		for (int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
	}

}

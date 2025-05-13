package Solo_study.cls;

import java.util.Arrays;

public class solution {

	public int solution(int[] array) {
		int answer =0;
		
		Arrays.sort(array);
		
		answer = array[array.length/2];
		
		return answer;
		
		
	}
	
}

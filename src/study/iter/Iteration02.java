package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
	
		
		//           	 반복분 while 
		
		/*
		  
		  while (조건식) {
		  	실행문
		  }
		  
		 */
		
		// i : 1 2 3 4 5
		for ( int i =1; i<=5; i++) {
			System.out.println("피곤하다~");
		}
		
		int i=1; 	 	//초기화	 한번 실행
		while(i<=5) { 	//조건식
			
			System.out.println("졸림"); // 실행문
			
			i++; //증감식
			
			//i=i*2;
			//i=i-50;
		}
		
		
		
		System.out.println("\n");
		
		i = 1;
		while(i<=5) {
			System.out.println(i);
			i++; // 마지막 6
			
		}
		
		i = 0;
		
		while (i<5) {
		i++; // 마지막 5
		System.out.println(i);
		// i++위로 올리면 마지막에 끝나는 숫자로 값이 저장되어있다.
		}
		
		while (i<5) {
			System.out.println("i<5");
		}
		do { // do 조건이 안맞아도 한번정도는 실행 
			System.out.println("i<5");
		}while(i<5); 	// do while은 while 뒤에 ;  필요함 
		
		
	
	
	
	
	
	}
}

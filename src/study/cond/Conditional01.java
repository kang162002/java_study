package study.cond;

public class Conditional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// 조건문 			if = true 면 실행된다
			
			
			int num = 5;
			
			if( num > 10) {
			System.out.println("Hello");
			System.out.println("num이 10보다 크더라~");
			}
			
			if (num <= 20) {
			System.out.println("20보다 작거나 같더라");
			
			}
		
			if( num != 5 )  // 중괄호가 없으면 조건문 다음 1줆ㄴ if문 범위에 종속됨 
			System.out.println("살펴봤더니");
			System.out.println("5는 아니더라~");	//if 문 범위에 들어가지 않음
			
			boolean b1 = (num == 5);
			
			// 삼항 연산자 (조건식 ? 참 : 거짓
//			if (b1) {
			//조건문 if ( 조건식 )
			if ( b1 == true ) {
				// ==는 같은 값인가
				System.out.println("num이 5다");
				
			}
		
			//변수 사용 범위
			
			if (b1 ) {
				System.out.println("b1 조건문 내부" + num);
				
				int x= 100;
				System.out.println("X =" + x);
			}	//	 범위영역 안에서만 활동이(사용이) 가능하다. 
				
			
			if (b1) {
				int x = 150;
			}
			
//			int x = 200; 	
//			System.out.println("x 값 확인 : " + x); 			//X 값을 외부에서 사용했기에 인식하지못한다
			
			//if - else  // if문의 조건식 결과의 대안을 내주는 
			
			
			
			
			
			System.out.println(" 프로그램 끝'");
				
	}

}

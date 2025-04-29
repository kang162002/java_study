package study.cls.Cls01;

public class Calculator {

	// 계산기 개채 표현용 
	
	
	
	//필드
	String brand;
	
	
	//생성자
	
	
	
	
	//메소드 (동작/기능)
	
	/*
	비교 		리턴(출력)		  매개변수
	 		   O			O
	  	       O			X
	  	 	   X			O
	  	 	   X			X
	  	 
	  	 리턴X : void
	  	 리턴O : 리턴할 타입
	  	 
	 */
	//	리턴X 없고 매개변수도 X 없는 // 사용법에 맞춰서  
	// 	계산기 전원켜는 메소드
	void powerOn () {
		//코드 작성 영역
		
		System.out.println("Power On!");
		//return;  /메소드를 종료하는 
	}
	
	//	리턴 X 매개변수O 버전
	// 	발기 조절 메소드
	// 	예)원하는 밝기 수치를 받아서 발기 조절기능 메소드
	void setBrightness (int bright) {
		System.out.println("밝기수치 " + bright + "로 조정합니다.");
		
		
	}
	
	//리턴 O 매개변수X 없는것
	
	String getInfo () {
		
		
		//메소드 실행후 반환(retrun)할 값을 작성
//		return	"전자계산기"; //숫자X String O
		
		String s ="전자계산기";
		return s;
				
	}
 	// 리턴 매개변수 O 
	//숫자 2개를 받아서 두 숫자의 합을 반환하는 
	int sum (int x, int y) {
		int result = x +y;
		return result;
	}
// 				
	String sum22 (int x, int y) {
		int result = x +y;
		return result+"";  //문자열변환
	}
	
	int sum (double x, double y) {
		return (int)(x + y);
	}
	
	int sumArr (int[] arr ) {
		int sum =0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	// void 리턴갑이 X 	
		
	
	
}

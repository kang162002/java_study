package study.cls.Cls02;

public class FinalMain {

	public static void main(String[] args) {
	
		int n =10;
		n= 20;
		n = 30;
		
		// 상수환
		final int a =30 ;	// final 이 붙는 순간 30으로 고정 값으로변환불가
		//a = 50; 값변환X
		
		System.out.println(ConstantNumber.TIMOUT_LIMIT_SECONDS); // 대문자면 상수인거로 인식
		
		int myState =3 ; // 1 ~ 3
		
		if (myState ==3 ) {
			System.out.println("건강하다");	// 기존
		}
		
		myState = ConstantNumber.HEALTH_STATE_GOOD;
		
		if (myState ==  ConstantNumber.HEALTH_STATE_GOOD) {
			
		}
		if (myState ==  ConstantNumber.HEALTH_STATE_BAD) {
			
		}
	}

}

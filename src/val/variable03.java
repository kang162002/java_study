package val;

public class variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동 타입 변환 작은대에서 큰대로 가는건 "자동타입변환"
		// 큰대에서 작은 타입으로 변환 옴기면 "강제타입변환" 
		// cha 보다 > int가 크다. 
		// int 보다 bouble 이 더크다.
		
		
		// 변수 타입변환 
		double d1 = 3.14;
		double d2 = d1; // 	double < double  동일 타입이기에 상관없다,
		
		int i1 = 30;
		int i2 = i1; //int	<- int 같은 정수 타입이라 상관X
		
		// int i3 = 3.33;	//int 정수형 <- 실수 3.33 저장불가XX
		
		double d3 = i1; // double < int 자동타입변환 큰타입 = 작은타입
		
		int i3 = (int)d2; // 작은타입 = 큰타입 (작은타입)큰타입 강제 타입변환
		
		System.out.println(d2); // 3.14
		System.out.println(i3); // 3 	강제타입변환시 소수점 0.14손실이 난다
		
		//byte 타입을 int로 인식
		// int + double 은 double 이다,
		
		//java 정수 -> int 타입 인식
		//java 실수 -> double 타입 인식
		
		float f1 = 5.5f;  	//float 타입 = double 타입
		d3 = f1; 	// double = float 자동
		
		
		double d4 =15;		// double 타입 = int 값  	15 -> 15.0 자동타입변환
		double d5 = 15.5;
		System.out.println(d4);
		
		int i6 = 10;
		double d6 = 5.5;
		
		double result1 = i6 + d6; // int + double -- > duble 인식
		System.out.println(result1);
		
		
		// int 	= double 
//		int result2 = i6 + d6; // int + double
		int result2 = + i6 + (int)d6; // int + int (5.5 - > 5 
		
		result2 = (int)(i6 + d6);	// 괄호가 우선순위//
					//int double 
			// 		(int + double )
		
		double dv1 = 5.5;
		double dv2 = 6.6;
			
		int rst = (int)dv1 + (int)dv2;
				//		5			6
		System.out.println(rst);	//11
		
		rst = (int)(dv1 + dv2);
				//	12
		System.out.println(rst );	//12
		
		// 정수 연ㅅ한 결과 실수 할떄 주의할점 
		int x = 1;
		int y =2;
		double z = x / y;
		// 연산 결과 타입 int로 인식 
		// int / in -> 연산결과 타입 int 
		// 	1  /  2 ->	 0 
		// z = 0.0 double = int 
		
		System.out.println(z);
		//int를 괄호를 넣어 강제로 double 로 전환 시킨다,
		// 변환 double / int..
		z = (double)x / y; 			// double / int -> double
		z = x / (double)y;			// int / double - > double
		z = (double)x / (double)y; 	// double / double -> double 
		System.out.println(z);
		
//		z = 10 / 3; 	// int / int 로 인식
		z = 10 / 3.0; 	// 소수점으로 나누면 인식한다, 
		
		//		--------------연산 -------------------
		
		//String str = "숫자" + 숫자; 문자열로 인식 "숫자" + "숫자; 동일		
		// +연산은 앞에서부터 순차적으로 수행
		
		
		
		
	}	

}

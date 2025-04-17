package study.practice;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		1. 아래 1), 2) 에 맞게 풀이.
//		int x = 10;
//		int y = 4;
//		___result = ___x/y;
//		System.out.println(result);
//		1) 결과가 2가 나오도록 작성하세요
//		2) 결과가 2.5가 나오도록 작성하세요
		
//		System.out.println(x - y - y); // 2
//		System.out.println((double)x /(double)y); // 2.5
		
		//2. 결과가 7.5가 나오도록 작성하세요
//		double a = 3.5;
//		double b = 4.7;
		//double result = _______________;
		//System.out.println(result);
		
//		System.out.println(a + (int)b); // 7.5
//		
//		3. 계산결과가 12가 나오도록 작성하세요
//		String a = "3.4";
//		String b = "4";
//		______ result = ________;
//		System.out.println(result);
//		double doubleA = Double.parseDouble(a); // 3.4 
//		int intA = (int)doubleA;
//		int intB = Integer.parseInt(b); // 4
//		
//		int result = (int)Double.parseDouble(a) * Integer.parseInt(b);
//		System.out.println((int)a * (int)b); // 12
		
		
//		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요. // 보류
//		String a = "10";
//		int b = 3;			//"10" -> 10 +	3 = 13
//		double c = 4.5;		
//		_____ result = _______;
//		System.out.println(result);
			//		
//		String result = a + Integer.parseInt(a) + b_; // "10" +( 13 )
				//	"10" + 10 + 3
				// 		"1010" + 3
				//		"10103"
//		System.out.println();
//		String result = a + ( (int) (b*c));
		
		
		//5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
//		int a = 4;
//		double b = 3.4;		// "" + 2 + 4 + 3 =243
//		String c = "6.8";	//4*6 = string.valueo(24) + 3 =243
//		_____ result = _______;
		
//		System.out.println();
		
//		String result = ((int)Double.parseDouble(c) -a ) + String.valueOf(a) + (int)b;
		
//		String result ="" + (a * (int)Double.parseDouble(c))+ (int)b;
		
		
		
//		6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int x = 111;
		int y = 13;
//		int result = _____;
//		System.out.println(result);
//		1) 출력결과 : 7
//		2) 출력결과 : 8
//		System.out.println(x / ++y); // 7
		System.out.println(x / y); 	 // 8
		
		
	}

}

package val;

public class varilable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//숫자 - > 문자열 = 바꾸거나
		
		
			//문자열 -> 숫자 = 바꾸거나
			
		String s1 = "1231";
		
		int n1 = 50;
		
		System.out.println(s1+n1);
		
			// 숫자형 String - > int
		
		int n2 = Integer.parseInt(s1);
			//	 Integer.parseInt(문자열); 문자열을 int형 숫자로 변환
		
		
		System.out.println(n1 + n2);
		System.out.println(n1 + Integer.parseInt(s1));
		
		String s2 = "13.13";
		
		
			//	더블타입
		double d1 = Double.parseDouble(s2);
			  	// 	double.ParaseDouble(문자열); 문자열을 double 숫자로 변환
		
			//	boolean 타입 
		boolean b1 = true;
		b1 =false;
		String s3 = "flase";
		boolean b2 = Boolean.parseBoolean(s3);
		
			//숫자 - > 문자열 
		
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(1512);
		String s6 = String.valueOf(155.222);
		
		
		String s7 = 1512 + "";  // "1512" 문자열과의 덧셈
		
			//	변수와 시스템 입출력 
		
		
	}

}

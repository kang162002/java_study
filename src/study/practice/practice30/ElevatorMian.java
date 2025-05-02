package study.practice.practice30;

public class ElevatorMian {

	public static void main(String[] args) {
		
		
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
		}
		public static String guide(int floor) {// guide 
			
			if (floor >= 1 && floor <= 10) {	
			//	floor 보다작거나 같은수 1 엔 && floor 보다 크거나 같은 10 일때 return "저층";	을 출력
				return "저층";
			}else if (floor >= 11 && floor <= 20) {
			// floor 보다 작거나 같은 11 엔드 && floor 보다 크거나 같은 20 이면 return "고층"; 을 출력
				return "고층";
			
				
			}
			
		return "";

		
		
		}

}



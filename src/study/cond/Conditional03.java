package study.cond;

public class Conditional03 {

	public static void main(String[] args) {
//-----------------------------------------------	 조건문 switch	------------------------------------ //		
		
		
		//if 보다 좀더 간단하게 
		int dice = 2;
		
		if (dice >= 1 && dice <= 3 ) {
			// 비교하거나 크거나와 같은 비교 가능
		}
		
		
		
		// switch 는 같은가만 가능 하나의 명령어?
		/*break (출력하더면 명령문+숫자등 을 멈추게해준다.)
		 * 
		*/
//		switch(dice) {
//		case 1: 	// dice == 1   //괄호가 필요없이 모두 아래에있는 모두 포함
//			System.out.println("dice 값이");
//			System.out.println("1이다"); 
//			break;
//		case 2: 	// dice ==2
//			System.out.println("2이다");
//			break;
//		case 99: 	// dice ==99
//			System.out.println("3이다");
//			break;
//		default: 	// else 
//			System.out.println("defult 이다");
//		}
		
		switch(dice) { // break 포함됨 // java 14 17 버전에 
		case 1 -> System.out.println("1이다"); 
			
		case 2 -> System.out.println("2이다");
			
		case 99 -> System.out.println("3이다");
			
		default -> System.out.println("defult 이다");
		
		
		}
		
		
		
		
		
		
		
		// switch 
		// double 실수형 불가 No
		char c = 'c';
		
		switch(c) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		default:
				
		}
		
		String day ="FRI";
				
		switch(day) {
		case "MON":
		case "TUE":
		case "FRI":
			System.out.println("금요일입니다");
			break;
		default:
				
				}
	}

}

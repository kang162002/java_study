package val;

public class variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "text";
		
		System.out.println("출력 1");
		System.out.println(s);
		
		System.out.println("출력 2");
		// println line 줄바꿈 포함
		
		System.out.print("출력 1");
		System.out.print(s);
		
		System.out.print("출력 2");
		// print line 줄바꿈 미포함
		
		System.out.println();
		
		int hour = 12;
		int minute = 36;
		// 	출력예상: 현재 12시 36분 입니다.
		
		// 	%d (정수) int		%f (실수타입)		%s (문자열)   \n 엔터효과 = 줄바꾸기 \t 탭효과   %% = %효과
		// 	%6d 6자리 정수. 왼쪽 빈자리 공백 / %-6d 	6자리 정수. 오른쪽 자리 빈공백
		System.out.println("현재 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute);
		// 					써야할 순서가 일치해야 한다.
		
		System.out.printf("이자는  3.5%% 입니다.");
		//	System.out.printf ("현제 %d시 %d분 입니다.", minute, hour );
		
		
		String menu = "햄버거";
		minute = 48;
		double rate = 4.1515;
		
		System.out.printf("오늘 %d분에 점심으로 %s를 먹고 은행 이자는 %6.2f%%더라~\n", minute, menu, rate);
		// 순서에 맞게 
		
		
		
		
		
	}

}

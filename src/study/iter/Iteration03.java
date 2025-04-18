package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		//
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i++;
			
			if (i == 5)
			break; // 실행중인 반복문을 끝내기
			
			i++;
			
			
		}
		
		// 무한루프
		
		int energy = 100;
		while(true) {
			System.out.println("달린다~");
			energy--;
			if (energy == 0 )
				break;
		}
			
			
//			
//		}
//					//    ┌> true 를 넣어도 괜찮다
//		for(energy =50; energy > 0; energy--) {
//			System.out.println("달린다");
//		} 
//		
		
		
		/*
		 반복 {
		 	멈춰야하는 사전 조건 확인 (사전 필터링)
		 	
		 	사전 필터
		 	//확인 하는 과정
		 	if (유통기한이 남았나?)
		 		break;
		 	it (이상한 냄새가 안나나?)
		 		break;
		 	if (곰팡이가 생겼는가?)
		 		break;
		 	if (먹을게 남았는가?)
		 		break;
		 	
		 	실행
		 
		 }
		 
		 */
//		System.out.println("=================");
//		
//		
//		for (i=1; i <=10; i++) { 
//		
//			if (i==5 || i==8)
//				continue; // 다음 회차로 넘어감 설정값의 5번과 8번을빼고 다음 설정값까지 계속 진행 continue
//			if (i == 7)
//				break;
//			System.out.println(i);
//		}
		
	
		
	
		
		
	}
}

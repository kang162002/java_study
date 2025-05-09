package study.practice.practice38;

public class Sports  {
	/* 1. 상속 관계 및 동일 패키지내에서 해당 필드를 자유로이 쓰게 하세요. */
	 
	protected  String name;
	
	public void description() {//
		System.out.printf("[%s]는 여가/경기/체력 단련 등을 위한 신체 운동입니다.\n", name);
	}

//	 농구
//	 class Basketball extends Sports {
//		/* 2. 메소드 오버라이딩(재정의)을 통해 농구을 설명해주세요. */
//		public void description() {
//			System.out.printf("[%s]는 여가/코트를 뛰며 골대에 골을 넣는/체력 단련 등을 위한 신체 운동입니다.\n", name);
//		}
	}

	// 축구
	class Soccer extends Sports {
		/* 3. 메소드 오버라이딩(재정의)을 통해 축구을 설명해주세요. */
		public void description() {
			System.out.printf("[%s]는 여가/축구공을 가지고 잔디에서 운동하는 /체력 단련 등을 위한 신체 운동입니다.\n", name);
		}
	}

	// 탁구
	class PingPong extends Sports {
		/* 4. 메소드 오버라이딩(재정의)을 통해 탁구을 설명해주세요. */
		public void description() {
			System.out.printf("[%s]는 여가/탁구체를 가지고 탁구공을 넘겨 점수를 내는 /체력 단련 등을 위한 신체 운동입니다.\n", name);
		}
	}

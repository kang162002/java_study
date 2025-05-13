package study.practice.practice45;

public class ExcerciseInstanceof {

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)

			action(arr[i]);
	}// Main

	static void action(Robot r1) {
		if (r1 instanceof DanceRobot) { // r1이 로봇이면 DanceRobot 호출
			DanceRobot dr = (DanceRobot) r1;
			dr.dance();

		} else if (r1 instanceof SingRobot) { // r1이 로봇이면 SingRobot 호출
			SingRobot sb = (SingRobot) r1;
			sb.sing();

		} else if (r1 instanceof DrawRobot) { // r1이 로봇이면 DrawRobot 호출
				DrawRobot db = (DrawRobot) r1;
				db.draw();
		}
	}

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
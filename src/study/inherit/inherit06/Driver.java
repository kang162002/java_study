package study.inherit.inherit06;

public class Driver {
//	public void drive(Bus bus) {	// 메소드 오버로딩
//		//	Main d.drive(b)도착  - > Bus 객체로 이동
//		System.out.println("Driver 운전시작");
//		bus.run(); // 버스 부르다
//	}

//	public void drive(Taxi taxi) {	// 메소드 오버로딩
//		System.out.println("Driver 운전시작");
//		taxi.run(); // 택시를 부르다
//	}

//						 Vehicle vehicle = b; new bus();
//						Vehicle vehicle = b; new bus();
	public void drive(Vehicle vehicle) { // 매개변수의 다형성
		System.out.println("Driver 운전 시작");
		vehicle.run();
	}

}

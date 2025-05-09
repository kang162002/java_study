package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {

		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();

		d.drive(b); // Drive 출발 ->
		d.drive(t);

		Bus b2 = takeBus(); // 버스에 담을수있다.
		Taxi t2 = takeTaxi();
		
		//Bus b3 = takeTaxi();
		//int b3 ="abc";
		
		Vehicle v = takeTaxi();
		Vehicle v2 = new Taxi();
		Vehicle v3 = takeBus();
		Bus b3 =takeBus();
		
//		Bus b4 = takeVehicle(); 
		//Bus = Vehicle ┘
		Vehicle v4 = takeVehicle();
		
	}

	public static Bus takeBus() {
		//Bus b =new Bus();
		return new Bus();
	}

	public static Taxi takeTaxi() {
		//Taxi t =new Taxi();
		return new Taxi();
	}
	public static Vehicle takeVehicle() {
		//Vehicle v = new Taxi ();
		return new Bus();
	}

}

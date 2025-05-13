package Solo_study.cls;



public class solocls {
								// 설계도 //
//-------------------------------	필드		-----------------------------------//
	
	String name;			//	이름
	String gender;			//	성별
	int age;				//	나이
	int weight;				//	몸무게
	double height;			//	키
	String job;				//	직업
	String bloodType;		// 	혈액형
	boolean isHealthy;		//	건강
	boolean isSleeping; 	//	잠 컨티션
	
//------------------------------	생성자	------------------------------------//
	
	solocls () { //아무거도없는 생성자
		
	}
	solocls (String name, String gender, int age, int weight, double height, String job
			,String bloodType, boolean isHealthy, boolean isSleeping) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height =height;
		this.job = job;
		this.bloodType = bloodType;
		this.isHealthy = isHealthy;
		this.isSleeping = isSleeping;
		
	}
	
	
	
//-------------------------------	메소드	---------------------------------------//
	
	void people () {
		System.out.println("이름 :" + name);					//	Strung	
		System.out.println("성별 :" + gender);				//	String
		System.out.println("나이 :" + age);					//	int
		System.out.println("몸무게 :" + weight);				//	double
		System.out.println("키 :" + height);					//	double
		System.out.println("직업 :" + job);					//	String
		System.out.println("혈액형 :" + bloodType);			//	String
		System.out.println("건강상태 :" + isHealthy);			//  boolean
		System.out.println("수면상태 :" + isSleeping);			//  boolean
		
	}
	
	
}

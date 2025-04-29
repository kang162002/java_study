package study.practice.practice27;

public class People {
	
	
	/*
		-사람 클래스-
		
			이름
			성별
			나이
			키
			몸무게
			직업
			혈액형
			건강상태
			수면중여부
	 */
	//필드
	String name;		// 	이름
	String gender; 		// 	성별
	int age;			// 	나이
	double height;		// 	키
	double weight;		// 	몸무게
	String job;			// 	직업
	String bloodType; 	// 	혈액형
	boolean isHealthy; 	// 	건강여부		// 	true false 
	boolean isSleeping;	// 	수면중여부  	//	true false 가능
	
	
	
	//생성자 : 객체가 생성될대 초기에 해야 할 일
	People () { // 초기화값 생성자
//		name = null; // 변수의 초기화를 생성자에서 해주기도한다.
//		gender = null;
//		age = 0;
//		height = 0;
//		weight = 0;
//		job = null;
//		bloodType = null;
//		isHealthy = true;
//		isSleeping =false;
	}
//	
//	// 생성자 선언하지 않으면? 기본생성자 자동생성
//	People (String name, String gender, int age, double height, double weight, String job,
//			String bloodType, boolean isHealthy, boolean isSleeping ) {
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//		this.job = job;
//		this.bloodType = bloodType;
//		this.isHealthy = isHealthy;
//		this.isSleeping = isSleeping;
//
//	}
	
	//					메소드  사용법 
 
	void printPersonInfo () {	// 리턴값이 없어서 void 
	
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("직업 :" + job);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("건강상태 : " + (isHealthy ? "건강" : "아픔")); 
		System.out.println("수면상태 : " + isSleeping);
		System.out.println("수면상태 : " + (isSleeping ? "자는중" : "안자는중"));
	}
	
	
	
}

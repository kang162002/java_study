package study.practice.practice41_1;

public class GasRange {
	/*
	가스렌지
	- 화구가 몇인지
	- 어디 브랜드인지
	- 가격이 얼마인지
	- 불을 켠다
	- 불을 끈다
	- 불세기르 조절한다.
	*/
	
	int craterCount;// 화구 갯수
	String name;
	int pirce;
	
	int currentFireLevel;
	
	// 불을 켠다
	public void fireOn () {
		currentFireLevel = 5;
	}
	// 불을 끈다 
	public void fireOff() {
		currentFireLevel = 0;
	}
	//불세기를 조절한다
	public void setCurrentFireLevel (int currentFireLevel) {
		
	}
	
}

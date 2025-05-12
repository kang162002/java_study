package study.practice.practice41_1;

public class Refrigerator01 {

	String brand;// 브랜드 이름
	int liter; // 몇리터 짜리 냉장고 용량 160 231 560
	int doorCount; // 문 갯수 1 2 4

	boolean isPowerOn; // true 켜짐
	int currentTemperature;
	int maxTemperature; // 냉장고 설정 가능한 최고온도
	int minTemperature; // 냉장고 설정 가능한 최저온도

	IceTray iceTray; 
	
	public void powerOn() {
		System.out.println("전원 켜짐");
		isPowerOn = true;
	}

	// 온도 올려
	public boolean uptemperature() {
		if (currentTemperature < maxTemperature) {
			currentTemperature++; // 온도 1도 올리기
			return true;
		}
		return false;
	}

	// 온도 내려
	public void downtemperature() {
		if (currentTemperature > minTemperature)
			currentTemperature--; // 온도 1도 내리기
	}

	// 온도 조절(매개변수)
	public void controllTemperature(boolean isUp) {
		if (isUp) {
			currentTemperature++;// 온도 1도 올리기
		} else {
			currentTemperature--; // 온도 1도 내리기
		}
	}

	// 몇도를 조절 할거다! 온도조절
// 		refri.controllTemperature(1)
//		refri.controllTemperature(3)
//		refri.controllTemperature(-5)
	public void controllTemperature(int temp) {
		if (currentTemperature + temp <= maxTemperature 
				&& currentTemperature + temp >= minTemperature)
			currentTemperature += temp;

	}

	// 온도세팅
	public void setCurrentTemperature(int temp) {
		if (temp <= maxTemperature && temp >= minTemperature)
			// 는
			this.currentTemperature = temp;
	}

}

package study.practice.practice28;

public class Circle {

	int radius; // 반지름
	
	

	
	
	void setRadius (int radius) {
		this.radius = radius;
	
	}
	
	double getArea() {
		double area = radius * radius * 3.14;
		return area; //리턴값이 있을땐 return 을 넣어줘야한다.
	}

	
	
	
}

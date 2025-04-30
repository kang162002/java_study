package study.practice.practice28;

public class Triangle {

	
	int width; //밑변
	int height; // 높이
	
	
	
	void setSize (int width, int height ) {
		this.width = width;
		this.height = height;
	}
	
	double getArea () {
		return width * height;
	}
	
}

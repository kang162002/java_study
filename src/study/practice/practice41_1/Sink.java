package study.practice.practice41_1;

public class Sink {

	int width;		// 	가로
	int height;		//	세로
	int depth;		//	깊이
	String color;
	String material;
	
	
	public int getWidth() {	//	 기본 getter 
		return width;	//	그상태로 mm 단위
	}
	
	public int getWidthAsCm () {	// width cm 단위로 반환하는 메소드
		return width/10;	
	}
	public double getWidthAsMeter () {	// width m 단위
		return width/1000.0;
	}
	
	
	
	
	
	
	
}

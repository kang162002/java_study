package study.practice.practice28;

public class monitor {
	//-----------------------	필드		-----------------------//
	
	String model;
	int year;
	int inch;
	
	
	
	
	//-----------------------	생성자	-----------------------//
	
	monitor () {
		
	}
	
	monitor (String model, int year, int inch) {
		this.model = model;
		this.year = year;
		this.inch = inch;
	}
	
	
	//-----------------------	메소드	-----------------------//
	
	void lg () {
		System.out.printf("%s제품 %d년형 %d인치TV", model, year, inch);
	}
	
	
	
}

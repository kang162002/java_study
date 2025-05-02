package study.practice.practice32;

public class SalaryMan {

	// 필드	//
	
	int salary = 1000000; // 초기갑
	
	
	//생성자//
	
	SalaryMan (int salary) {
		this.salary = salary;
	}
	
	//메소드//
	
	public int getAnnualGross() {
		
		return salary * 12 + salary *5;
		
	}
	

	
	
}

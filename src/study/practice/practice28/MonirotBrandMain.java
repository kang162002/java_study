package study.practice.practice28;

public class MonirotBrandMain {

	public static void main(String[] args) {
		
		
		MonirotBrand m1 = new MonirotBrand("삼성", 27, 150000);
//		m1.color = "검은색";	//	
		m1.setColor("검은색");	//	매개 변수
		m1.setXY(1080, 780);
		
		
		MonirotBrand m2 = new MonirotBrand("LG", 32, 330000);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.printInfo();
		m2.printInfo();
		
		int m2price =m2.addPrice(70000); // return
		System.out.println("m2 모니터 인상 후 금액 : " + m2price);
		
		m1.addPrice(50000);
		
		m1.printInfo();
		m2.printInfo();
	}

}

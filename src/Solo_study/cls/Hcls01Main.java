package Solo_study.cls;

public class Hcls01Main {

	public static void main(String[] args) {
		
		 int[] date = {2025, 4, 29}; // 날짜: 년, 월, 일
	        int[] goods = {123, 456}; // 상품 번호
	        Hcls01 order = new Hcls01(20210, "peemang123", date, "피망", "PD", goods, "123 Street", 98765);

	        order.order(); // 메소드 호출
	    }




}

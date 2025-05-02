package study.practice.practice33;

public class salaryManMain {

	public static void main(String[] args) {
		salaryMan sm = new salaryMan ();
		sm.getAnnualGross();
		
		
		System.out.println(new salaryMan().getAnnualGross());
		System.out.println(new salaryMan(2000000).getAnnualGross());

	}

}

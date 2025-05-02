package study.practice.practice30;

public class GambleMain {

	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
		}
		public static int dice() {
			
		return (int)(Math.random()*6)+1;
		}
		public static double exchange(double dollar) {
			
			
			
		/* 입력받은 달러를 환전하여 반환 하시오 */
		return dollar * 1082.2518;
		}

	}


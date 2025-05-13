package study.practice.practice41_1;

public class TrashCan {

	int liter;
	String color;

	
	int trashPercentage; // 쓰레기 용량 체크 70 80 80%
	boolean isScovero;
	
	
	public void openCover() {
		isScovero = true;
	}
	
	public void closeCover () {
		isScovero = false;
	}
	
	// 쓰레기 비운다
	public void clearTrash() {
		trashPercentage =0;
	}

	// 쓰레기 채우기 
	public void insertTrash (int percentage) {
		trashPercentage += percentage;
		//30% += 5%
	}
	public void inserTrashLiter(int trashLiter) {
		// 쓰레기 3리터 버림
		// 40리터짜리 쓰레기통
		
		
		trashPercentage += (trashLiter/liter) * 100;
		//					소수점.	올림
		// 	3 / 40=
		
		
		
	
	}
	
	
	
	
}
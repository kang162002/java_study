package Solo_study.pracite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

//	public static void main(String[] args) {

	String truckBrandName; // 푸드 트럭 이름
	String owner; // 푸드트럭 사장

	List<Food> foodList; // 판매하는 음식 리스트

	int totalSales; // 총 매출액
	boolean isOpened; // 영업중 여부 true 열었다

		//일자별 매출이력 관리용 리스트
	List<SalesInfo> salesInfoList;
	
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
		salesInfoList =new ArrayList<SalesInfo>(); // 초기화
	}

	public FoodTruck(String truckBrandName, String owner) {
		this.truckBrandName = truckBrandName;
		this.owner = owner;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addMenu(Food food) {
		foodList.add(food);
	}

	public void addMenu(String name, int price) {
		foodList.add(new Food(name, price));
	}

	public void doSales() { // 푸드트럭 장사 메소드

		// 전체 실행 로직 조율
		Scanner scanner = new Scanner(System.in);
		isOpened = true; // 영업중 표시
		System.out.printf("===[%s %s 푸드트럭영업시작]===\n ", owner, truckBrandName);
		while (isOpened) {
			// 시스템 메뉴
			
			int menu = getMainMenu();
			int order;

			switch (menu) {
			case 1: // 메뉴보기
				// 보유하고 있는 음식 리스트
				showFoodList();// 보유하고 있느 음식 리스트 메뉴로 보여주기
				break;
			case 2: // 주문하기
				orderMenu();
				break;
			case 3: // 재고관리
				mangeStock();
				break;
			case 4: // 마감하기
				finishSales();
				break;
			
			}
		}

	}
	//메인 메뉴 번호 선택 처리
	public int getMainMenu () {
		// 1 ~ 4 번 정상 멘 입력시에만 진행
		
		
		Scanner scanner =new Scanner(System.in);
		int menu = 0;
		
		
		while(true) {
			//시스템 메뉴
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.println(">>> 입력 :");
			menu = scanner.nextInt();
			
			if (menu >= 1 && menu <=4) {
				break;
			}else {
				System.out.println("--> 잘못입력하셨습니다.");
				System.out.println("--> 보기중에 선택하세요(1~4)\n");
			}
			
		}
		return menu;
		
	}
	

	// 메뉴 보여주기 메소드
	public void showFoodList() {
		System.out.println();
		System.out.println("[-----메뉴리스트-----]");
		for (Food f : foodList) {
			System.out.println(f.getFoodInfo());
		}
	}

	// 주문하기 기능 메소드
	public void orderMenu() {
		showFoodList();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>> 주문메뉴 선택 :");
		int order = scanner.nextInt();
		
		Food orderFood =foodList.get(order-1);
		
		if(orderFood.stock <1) {
			System.out.println("> 해당 메뉴는 품절입니다");
			return;
		}
		
		//정상
		totalSales += orderFood.price;
		//주문 갯구만큼 재고 감소
		orderFood.modifyStock(-1);// 재고 -1조절
		System.out.println(">>> 재고 품절");
	
	}
	public void mangeStock() {
		showFoodList();
		Scanner scanner = new Scanner(System.in);
		System.out.println("[----재");
		
		System.out.println(">>> 재고 관리할 메뉴 선택");
		
		int order = scanner.nextInt();

		System.out.println(">>> 재고 조정할 개수를 입력 :");
		int changeStockConunt = scanner.nextInt();

		Food stockFood = foodList.get(order - 1);
		stockFood.modifyStock(changeStockConunt);
		System.out.println(">>> 재고 조정완료");
		System.out.println(stockFood.getFoodInfo());
		System.out.println("[-----------------------------]");
	}
	public void finishSales() {
		// 마감시 남은 재고 갯수 * 해당 메뉴금액 30% 폐기 손해가 매출액에서 마이너스된다.
		// 마감시 당일 매출액을 보여주고 종료됩니다.
		int lossSales = 0; // 폐긴등 손해금액
		for (Food food : foodList) {
			lossSales += (food.price * 0.3) * food.stock;
		}
		System.out.println("===[마감 정산 내역]===");
		System.out.println(">> 총 매출액 : " + totalSales);
		System.out.println(">> 폐기 손해 : " + lossSales);
		System.out.println(">> 최종 수익 : " + (totalSales - lossSales));
		
		SalesInfo si =new SalesInfo();
		si.totalSales =	totalSales;
		si.lossSales = lossSales;
		si.income = (totalSales - lossSales);
		
		salesInfoList.add(si);
		
		isOpened = false;
		System.out.printf("===[%s %s 푸드트럭 영업종료]===\n ", owner, truckBrandName);
	}
	
}

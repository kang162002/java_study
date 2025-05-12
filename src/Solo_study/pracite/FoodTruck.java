package Solo_study.pracite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

//	public static void main(String[] args) {

	String truckBrandName; 	// 푸드 트럭 이름
	String owner;			// 푸드트럭 사장
	
	List<Food> foodList; 	// 판매하는 음식 리스트
	
	int totalSales; 		//총 매출액
	boolean isOpened; 		// 영업중 여부 true 열었다

	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
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
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1: // 메뉴보기
				// 보유하고 있는 음식 리스트
				System.out.println();
				System.out.println("[-----메뉴리스트-----]");
				for (Food f : foodList) {
					System.out.println(f.getFoodInfo());
				}
				break;
			case 2: // 주문하기
				System.out.println();
				System.out.println("[-----메뉴리스트-----]");
//				for(Food f : foodList) {
				for (int i = 0; i < foodList.size(); i++) {
//					if(foodList.get(i).stock > 0)

					System.out.println((i + 1) + ". " + foodList.get(i).getFoodInfo());

				}

				System.out.print(">>> 주문 메뉴를 선택 :");
				int order = scanner.nextInt();
//				System.out.println("주문한 메뉴:" + foodList.get(order-1).getFoodInfo());
				Food orderFood = foodList.get(order - 1);

				// 재고가 없으면 주문 불가
//				if(foodList.get(order-1).stock <1) {
				if (orderFood.stock < 1) {
					System.out.println("> 해당 메뉴는 품절입니다");
					break;
				}
				// 주문하면 메뉴 금액만큼 매출 증가
				totalSales += orderFood.price;

				// 주문 갯수 만큼 재고 감소
//				foodList.get(order-1);
				orderFood.modifyStock(-1); // 재고 -1 조절

				System.out.println(">>> 주문완료 : " + orderFood.name);

				break;
			case 3: // 재고관리
				System.out.println("[----재고관리자---]");
				System.out.println("[----메뉴리스트---]");

				for (int i = 0; i < foodList.size(); i++) {
					System.out.println((i + 1) + ". " + foodList.get(i).getFoodInfo());
				}

				System.out.println(">>>> 재고관리할 메뉴를 선택 :");
				order = scanner.nextInt();

				System.out.println(">>> 재고 조정할 개수를 입력 :");
				int changeStockConunt = scanner.nextInt();

				Food stockFood = foodList.get(order - 1);
				stockFood.modifyStock(changeStockConunt);
				System.out.println(">>> 재고 조정완료");
				System.out.println(stockFood.getFoodInfo());
				System.out.println("[-----------------------------]");
				break;
			case 4: // 마감하기
				// 마감시 남은 재고 갯수 * 해당 메뉴금액 30% 폐기 손해가 매출액에서 마이너스된다.
				// 마감시 당일 매출액을 보여주고 종료됩니다.
				int lossSales = 0; // 폐긴등 손해금액
				for(Food food : foodList) {
					lossSales += (food.price*0.3) * food.stock;
				}
				System.out.println("===[마감 정산 내역]===");
				System.out.println(">> 총 매출액 : " + totalSales);
				System.out.println(">> 폐기 손해 : " + lossSales);
				System.out.println(">> 최종 수익 : " + (totalSales - lossSales));
				
				
				isOpened = false;
				System.out.printf("===[%s %s 푸드트럭 영업종료]===\n ", owner, truckBrandName);
				break;
			default:
				System.out.println("--> 잘못 입력하셨습니다. \n");

			}
		}

	}
}

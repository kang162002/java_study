package Solo_study;

import java.util.Scanner;

public class solojava04 {

	public static void main(String[] args) {
		
		
		
		 Scanner scanner = new Scanner(System.in);

	        // 탑승 인원 입력
	        System.out.print("탑승 인원을 입력하세요: ");
	        int passengers = scanner.nextInt();

	        // 각 사람의 내릴 층 입력받기
	        int[] floors = new int[passengers];
	        for (int i = 0; i < passengers; i++) {
	            System.out.print("내릴 층을 입력하세요 (2~100): ");
	            floors[i] = scanner.nextInt();
	        }

	        // 엘리베이터 올라가기
	        for (int currentFloor = 1; currentFloor <= 100; currentFloor++) {
	            System.out.println("층: " + currentFloor);

	            // 해당 층에서 내릴 사람 확인
	            for (int i = 0; i < passengers; i++) {
	                if (floors[i] == currentFloor) {
	                    System.out.println(currentFloor + "층에서 내립니다.");
	                }
	            }
	        }

	        // 엘리베이터 내려가기
	        for (int currentFloor = 100; currentFloor >= 1; currentFloor--) {
	            System.out.println("현재 층: " + currentFloor);

	        }
	      
	        
	        scanner.close();
	        
		

	}

}

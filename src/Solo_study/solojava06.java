package Solo_study;

import java.util.Scanner;

public class solojava06 {

	public static void main(String[] args) {

		// test01 ();
		test02();
	}

	public static void test01() {

		Scanner scanner = new Scanner(System.in);

		// 엘베 입장

		System.out.print("타는 사람 입력 : ");
		int floor = scanner.nextInt();

		int[] floorUp = new int[floor]; // floor 타는 사람수 입력값 floorUp에 저장 // Scanner 에 저장
		for (int i = 0; i < floor; i++) { // scanner 입력값 floorUp에 저장
			// i:0 초기화값
			// 내릴 층 입력
			System.out.println("내릴 층 입력 :");
			floorUp[i] = scanner.nextInt(); // 내릴 층 입력 저장값
			// i : 입력값저장
		}
		// 엘리베이터 올라가기
		// i : 1 100낮거나 같으면 멈춘다 입력값의 +1
		for (int aelUp = 1; aelUp <= 100; aelUp++) {
			// 층 표시
			System.out.println("층 :" + aelUp);
			// 입력한 층에서 내리기
			for (int out = 0; out < floor; out++) {
				if (floorUp[out] == aelUp) {
					// floorUp안에있는 out 층내림 값과 같으편 aelUp을 층수를 출력
					System.out.println(aelUp + "층에서 내림");
				}
			}
			for (int floordown = 100; floordown >= 1; floordown--) {
				// 저장값 100 // 1보다크거나 같다. -1씩 빼면서
				System.out.println("층" + floordown);
			} // -1씩 빠지는 숫자 출력
		}
		// 엘리베이터 층
		// for (int out=0; out< floorUp.length; out++) {} // 오류 Fall 틀리게 입력

	}

	public static void test02() {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("타는 사람 입력 : ");
		int floor = scanner.nextInt();

		int[] floorUp = new int[floor]; // floor 타는 사람수 입력값 floorUp에 저장 // Scanner 에 저장
		for (int i = 0; i < floor; i++) { // scanner 입력값 floorUp에 저장
			// i:0 초기화값
			// 내릴 층 입력
			System.out.print("내릴 층 입력 :");
			floorUp[i] = scanner.nextInt(); // 내릴 층 입력 저장값
			// i : 입력값저장
		}
		
		int stopCount =0;
		// 내릴 사람들 층수
		for (int aelUp=1; aelUp <=100; aelUp++) {
			System.out.println("현재층 :" + aelUp );
			//내리는 사람 표시
			for(int out=0; out <floor; out++ ) {
				if(floorUp[out] == aelUp) {
					System.out.println("내린 사람 : " + aelUp);
						stopCount++; // 멈추는 횟수
						if(stopCount>=7) { // 
						
							System.out.println("운영 중지 점검");
							break;
						}
					}
				}
			
		}
		// 엘리베이터 층
		// for (int out=0; out< floorUp.length; out++) {} // 오류 Fall 틀리게 입력

			}
		

	}


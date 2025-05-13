package Solo_study;

import java.util.Random;
import java.util.Scanner;

public class solojava07 {

	public static void main(String[] args) {
		// pra1 ();
		// pra2 ();
		pra3();
	}

	public static void pra1() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		/*
		 * 야구 게임 (스크린 야구, 공격만)
		 * 
		 * 스크린 야구 게임을 제작하려고 합니다. 해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다. 투수의 공은
		 * 컴퓨터이며, 타자는 사용자 입니다. (반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
		 * 
		 * - 기본 문제 투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다. 사용자의 입력도 1 ~10까지 이며, 투수의 공과 사용자의 입력과
		 * 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다. 해당 게임은 3아웃이면 종료됩니다.
		 * 
		 */

		// 게임 시작
		int out = 0;
		int inning = 0;
		String[] name = { "투수", "플레이어" };

		System.out.println("게임 시작");

		System.out.print("사용자 입력 : ");
		int play = scanner.nextInt();
		for (int ball = 1; ball <= 1; ball++) {
			for (int j = 0; j < name.length; j++) {
				int game = random.nextInt(10) + 1;
				System.out.printf("%s : %d  \t", name[j], game);
				while (inning <= 3) {
					System.out.println("현재 이닝" + inning + "회");
					inning++;
					if (out < 3) {
						System.out.print("타격(1:안타,2:아웃)");
						int action = scanner.nextInt();
						if (action == 1) {
							System.out.println("안타");
						} else if (action == 2) {
							System.out.println("아웃");
							action++;
						} else {
							System.out.println("현재 아웃" + out);
						}
					}
				}
			}
		}
	}

	public static void pra2() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int out = 0;
		int inning = 0;
		String[] name = { "투수", "플레이어" };

		// 이닝 반복 관리
		while (inning < 3) {
			System.out.print("사용자 입력 :");
			int play = scanner.nextInt();
			System.out.println("현재 이닝 : " + (inning + 1) + "회");
			// 모든 이닝에서 투수와 플레이어 출력
			for (int i = 0; i < name.length; i++) {
				int game = random.nextInt(10) + 1;
				System.out.printf("%s : %d\n", name[i], game);
			}
			System.out.println(); // 줄바꿈

			System.out.print("타격(1:안타 2:아웃) :");
			int action = scanner.nextInt();

			if (action == 1) { // 안타처리
				System.out.println("안타");
			} else if (action == 2) { // 아웃처리
				System.out.println("아웃");
				out++;
			}
			System.out.println("잘못입력하셨습니다");
		}

		System.out.println("현재 아웃 : " + out);

		// 3아웃일때 이닝졸료
		if (out >= 3) {
			System.out.println("현재 이닝 종료");
			out = 0; // 아웃 초기화
			inning++; // 다음 이닝으로 이동
		}
		System.out.println("게임 종료");

	}

	public static void pra3() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// 게임시작

		int out = 0;
		int inning = 0;
		int incorrectInput = 0;
		String[] name = { "플레이어", "투수" }; // String 에 문자열 저장
		String[] playname = {"선수1","선수2","선수3","선수4","선수5"};
		int[] playnumber = new int[playname.length];
		while (inning < 3) { // 총 3이닝동안 반복

			for (int i = 0; i < name.length; i++) {
				System.out.println("현재 이닝 " + (inning+1) + "회");
				// 투수 랜덤값 출력
				int bowler = random.nextInt(10) + 1;
				System.out.print("플레이어값 직접 입력 :"); // 플레이어 직업 입력값 작성
				int play = scanner.nextInt(); // 플레이어 입력값 출력
				// 플레이어값 10이상 쓰는거 제한
				if (play >= 11) {
					incorrectInput++;
					System.out.println("잘못된 입력횟수" + incorrectInput + "회");
					if (incorrectInput >= 3) { // 조건값 3회이상 잘못입력했을시 아웃처리
						System.out.println("입력 3회 초과로 아웃");
						out++;
						incorrectInput = 0; // 잘못된 입력값 초기화
					}
				} else {
					System.out.printf("%s : %d \t %s : %d\n", name[i], bowler, name[i], play);
					if (play > bowler) {
						System.out.println("안타");
					} else if (play == 10) {
						System.out.println("홈런");
					} else {
						System.out.println("아웃");
						out++;
					}
				}
				System.out.println("현재 아웃" + out);
				
				if ( out >= 3 ) {
					System.out.println("현재 이닝 종료");
					out = 0;	// 아웃 초기화
					inning ++; // 다음 이닝으로 이동
				}
			}
			System.out.println("게임 종료");
		}

	}

}

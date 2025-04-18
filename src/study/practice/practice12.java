package study.practice;

import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		for (int i = 1; i<=5; i++) { // 5회반복 1234 5번 반복
			System.out.println("12345");
		}
		
		for (int i=1; i<=5; i++) { // 5회 반복   1111 / 2222 .... 5번까지 5번 반복
			System.out.println(""+i+i+i+i+i);
		}
		
		
		for (int i=1; i<=5; i++) { // 5회 반복  동일하지만 다른방법
			System.out.println(11111*i );
		}
		
		for (int i=11111; i<=55555; i=i+11111) { // 5회 반복  
			System.out.println(i);
		}
		
		// 1.2) 1번 문제와 2번 문제를 한번에 해결하는 방법
		for (int i=1; i<=3; i++) { // 5회 반복  i 가 출력에 참여   1111 ... 나오는 // i 출력 갯수
			for(int j=1; j<=5; j++) {   // j를 출력값에 올리면 1~5번까지 순서대로 5번 // j 출력 번호 갯수
				System.out.print(j);
			}
			System.out.println("");
		}	
		
		

	}

}

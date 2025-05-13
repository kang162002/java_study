package Solo_study;

import java.util.Random;
import java.util.Scanner;

public class solojava03 {

	public static void main(String[] args) {
	//Prca1();	
	//Prca2();

	
	}

	public static void Prca1() {
		
		
		//로또 랜덤 번호 만들기 //
		Random random = new Random();

		int[] lotArr = new int[6];

		for (int i = 0; i < lotArr.length; i++) { // 배열값 저장
			int num = (int) (Math.random() * 45) + 1; // num 으로 랜덤 번호 저장
			lotArr[i] = num; // 랜덤번호 저장한 num을 다시 배열값으로 저장
			for (int j = 0; j < i; j++) { // J값은0 J보다 작거나 크다 i
				if (lotArr[i] == lotArr[j]) { // 배열i 와 배열J의값은 동등
					i--;
					break;
				}

			}
			System.out.print(lotArr[i] + " \t");
		}

	}
	public static void Prca2() {
		
		int[][] intArr = new int[4][4];
		
		int num = 1;
		
		for (int i = 0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = num++; 
			}
			
		}
		for(int i=0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				System.out.printf("%3d", intArr[i][j]);
			}
			System.out.println();
		}
			System.out.println();
		
		num = 1;
		
		for (int i = 0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				intArr[j][i] = num++;
			}
		}
		for (int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.printf("%3d",intArr[i][j]);
			}
			System.out.println();
		}
			System.out.println();
		
			
		num =1;
			
		for (int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				intArr[i][j] = (16-i) - (4*j);
			}
		}
		for (int i=0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				System.out.printf("%3d", intArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
}

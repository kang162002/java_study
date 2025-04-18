package study.practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
		// 1번 정답
		for (int i =0; i < 11; i++) {
			 System.out.print(i+ "");
				
		}
		
		System.out.println("");
		
		// 2번 
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "");
		}
		
		System.out.println("");
		
		// 3번
		for (int i = 10; i <= 100; i+=10) {
			
			System.out.println(i + "");
		}
		
		System.out.println("=================");
		
		
		// 4번 i 가 25 50 75 100 해서 4번 반복

		
		for (int i = 25; i <= 100; i+=25) {
			System.out.println(i + "");
		}
		
		
		
		// while 
		
		//5번 i 가 50~55 6번 반복	
		
		
		int i= 50;
		while (i <= 55) {
			System.out.println(i +" ");
			i++;
			
		}
		
		System.out.println();
		
		//6번  10 ~ 1로 10번 반복 (반대방향)
		
		i = 10;
		while ( i >= 1) {
			System.out.println(i + "");
			i--;
			if (i < 1)
				break;
		}	
		System.out.println();
		
		// 7번 i가 30~0 으로 5씩 감소하면서 7번 반복
		
		
		i = 30;
		while (i>=0) {
			System.out.println(i+ "");
			i=i-5;
		}
		System.out.println("   ");
		
		// 8번
		

		i = 30;
		while (i>=5) {
			System.out.println(i+ "");
			i=i-5;
		}
		System.out.println("   ");
		
		// 9번  25~ 0 으로 5씩 감소
		
		i = 25;
		while (i>=0) {
			System.out.println(i+ "");
			i=i-5;
		}
		System.out.println("   ");
	
	}
}

package study.refer;

public class Refernce05 {

	public static void main(String[] args) {
		//배열 복사
		
		
		int[] arr1 = {10,20,30};
		int[] arr2 = arr1; 
			
		
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		
		arr1[0]=100;
		
		System.out.println("arr1");
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("arr2");
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		int a = 10;
		int b = a;
		
//		System.out.printf("%a:%d b:%d \n",a,b);
//		a = 20;
//		System.out.printf("%a:%d b:%d \n",a,b);
		//정수형 변수 : 주소( 참조형 변수 ) 
		//기본 타입에 :  참도 타입을 넣으려해서 오류
		
		
//		int c = arr1[2];
//		
//		//arr1 - > arr3 
//		int[] arr3 = new int[3]; // {0,0,0}
//		
//		//arr3 = arr1;
//		for(int i=0; i<3; i++) {
//			arr3[i] =arr1[i]; //기본 타입 int값 복사
//		}
//
//		System.out.println("arr1");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		
//		
//		System.out.println("arr3");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr3[i] + " ");
//		}
//		System.out.println();
//		
//		
//		
//		int[] arr4 = new int[3];
//		
//		//arr1 -> arr4
//		System.arraycopy(arr2, 0, arr4, 0, 3);
//		
//		//arr1 과 arr4는 개별적
//		
//		
//		System.out.println("arr1");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		
//		
//		System.out.println("arr4");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr4[i] + " ");
//		}
//		System.out.println();
//		
//		arr1[2] = 300;
//		
//		
//		System.out.println("arr1");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		
//		
//		System.out.println("arr4");
//		for(int i=0; i<3; i++) {
//			System.out.print(arr4[i] + " ");
//		}
//		System.out.println();
	}

}

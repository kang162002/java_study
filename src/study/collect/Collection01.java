package study.collect;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		
//					ArrayList					//
		
		
		//기본배열
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		
		for (int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (String value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList <String>(); // ArrayList 라는 공간을 만들었다		
		
		ArrayList<String> list2 = null;
		//ArrayList<Menu> Menu[]
		//ArrayList<Order> Order[]
		
		System.out.println(list.size()); 	//	ArrayList 라는 공간이있어서 size() 가능
//		System.out.println(list2.size()); 	// 	null뿐이없어서 출력시 오류

		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		// 갯수에 상관없이 만들수있다
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		for ( int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		 
		list.add(2 ,"A");  	// A를 추가하고싶을때 list에 index 번호를 적는다.
		//	2인덱스에 "A" 추가 ( 2인덱스 부터 뒤로 밀림)
		
		list.set(3, "H"); 	// .set를 이용하여 index 3번 F를 H로 바꾼다. 
		//	3인덱스에 "H" 저장 ( 해당위치 값이 바뀜)
		
		list.remove(0); 	// 0인덱스 값 삭제 // .remove index값지우기(0,1,2,3)
		list.remove("G"); 	// "G" 값을 삭제
		for (String v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		// .contains 를 추가하여 변수값이 있느냐 없느냐 확인
		System.out.println(list.contains("Z")); // 없으면 false 
		System.out.println(list.contains("E")); // 있으면 true
		
		int[] intArr = new int[10];
		
//		ArrayList<int> intList = new ArrayList<int>();  // 불가X
		//담을수 있는 (참조변수)객채여야한다,
		ArrayList<Integer> intList = new ArrayList<Integer> ();
		//Integer.prarseInt(null);
		
		//포장객체 Wrapp
		
	
		
	}

}

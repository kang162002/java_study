package study.cls.Cls05;

public class ClsMain {

	public static void main(String[] args) {
	
		int n1 = 20;
 		int n2 = 30;
 		int[] nArr= {10, 20};
 		int[] nArr2 =new int [5];
 		
 		nArr[0] = 30;
 		
 		Temp t1 = new Temp();		//	 만들어진 주소의 리턴
 		Temp t2 = new Temp();
 		Temp[] tArr2 = {t1, t2};  // 
 		Temp[] tArr = new Temp[3];
 					 	//new Temp ();
 		//새로 직접 만들어도 O
 		
 		Temp[] tArr3 = {new Temp(), new Temp(), new Temp()};
 		
 		
 		t1.method();
// 		tArr[0].method(); // NullPointerException
 		tArr[0] = new Temp();
 		tArr[1] = new Temp();
 		tArr[2] = new Temp();
 		
 		for ( int i=0; i< tArr.length; i++) {
 			tArr[i] = new Temp();
 			tArr[i].method();
 		}
 		
 		
 		System.out.println(methodA(30));
 		
 		t1.name = "t1";
 		Temp result = methodB(t1);
 		System.out.println(result.name);
 		int[] result2 = methodC(nArr);
 		for(int i=0; i<result2.length; i++) {
 			System.out.println(result2[i] + " ");
 		}
 		System.out.println();
 		
 		Temp[] result3 = methodD(tArr2);
 		System.out.println("---------------result3-------------");
 		for(Temp t : result3) {
 			t.method();
 		}
 		
 		Temp[] rrr =methodE(null);
 		if(rrr != null ) {
 			rrr[0].method();
 		}
	}	
	
	
	public static int methodA(int n) {
		return n +30;
	}

	public static Temp methodB(Temp t) {		// temp
		
		System.out.println(t.name);
		
		Temp tt = new Temp ();
		return tt;
	}
	public static int[] methodC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		
		int[] result = { 1,2,3,4};
		
		return result;
	}
	
	
	public static Temp[] methodD(Temp[] tArr) {
		for(int i=0; i<tArr.length; i++) {
			tArr[i].method();
		}
		for (Temp t : tArr ) {
			t.method();
		}
		
		Temp[] arr= {new Temp(), new Temp(), new Temp()};
		return arr;
	}
	
		//						  Temp tt = null; // 들어갈수있다
	public static Temp[] methodE (Temp tt) {
		
		return null; 
		
		//Temp[] tArr = null; 을 넣을수있느냐 
	}
}

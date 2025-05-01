package study.cls.Cls04;

public class SingletonMain {

	public static void main(String[] args) {
		
//		
//		Singleton st1 = new Singleton();
//		Singleton st1 = new Singleton();
//		Singleton st1 = new Singleton();
//		Singleton st1 = new Singleton();
		
		
		Singleton st = null;
		// 담을수는 없지만 생성까지는 가능
		
//		Singleton ss =new Singleton();
//		ss.singleton;
		
//		st =Singleton.singleton; 
		
		st = Singleton.getIntance();
		
		Singleton st2 = Singleton.getIntance();
		Singleton st3 = Singleton.getIntance();

	}

}

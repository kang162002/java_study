package study.cls.Cls04;

public class Singleton {

	// 싱글 톤 : 전체~ 에서 1개만 존재

	static Singleton singleton = new Singleton(); //
	
	//외부에서 생성 방지
	private Singleton() {

	}

	static Singleton getIntance () {
		return singleton; // 리턴
	}
	
}

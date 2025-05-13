package study.practice.practice33;

public class Computer {

//	다음을 만족하는 클래스 Computer를 작성하시오.
//	· 다음을 상수 필드로 선언
//	public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
//	· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
//	자와 메소드 구현

//	운영체제: 윈도우10, 메인메모리: 16
//	운영체제: 애플 OS X, 메인메모리: 32
//	운영체제: 안드로이드, 메인메모리: 16
//	public final String[] osType = { "윈도우10", "애플 OS X ", "안드로이드" };
					// static final일때 이름 을 대문자
	public static final String[] OS_TYPE = { "윈도우10", "애플 OS X ", "안드로이드" };  // 문자열 배열 저장
	// 이름값이 바뀌지않게 할때 쓰는 final

	public int osIndex;
	public int memory;
//	public String os; // os 이름

	public Computer(int osIndex, int memory) {
		this.osIndex = osIndex;
		this.memory = memory;
		
//		this.os = osType[osIndex];
	}

	public void print () {
		System.out.printf("운영체제 : %s, 메인메모리 : %d,\n", OS_TYPE[osIndex], memory);
//		System.out.printf("운영체제 : %s, 메인메모리 : %d,\n", os, memory);
	}
}

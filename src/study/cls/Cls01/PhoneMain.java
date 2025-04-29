package study.cls.Cls01;

public class PhoneMain {

	public static void main(String[] args) {
//		Phone p1 = new Phone(); // 사용불가
		
		Phone p1 = new Phone ("갤럭시21"); // 생성자 1과 연결 가장 가까운
		
		Phone p2 = new Phone ("갤럭시14"); 
		
		Phone p3 = new Phone ("아이폰15",300);	// 생성자  2와 연결 가장 가까운
		
		Phone p4 =new Phone ("갤럭시25", 250, 5000);
	}
//  메소드 이름을 적을대 동사를 이용하여 직관적이게 쓴다,
	
	
}

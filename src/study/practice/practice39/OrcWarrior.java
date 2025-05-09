package study.practice.practice39;

public class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
	super(name, hp); // 부모 클래스 생성자에서 가저옴
	this.amor = amor;	// 자체적으로 있는 정수
//	this.hp = hp;	//	 오크에서 가저옴
	}

	// 메소드 오버라이딩!
	public String toString() {
//	return "이름:"+name +" HP:"+hp+ " 아머:" + amor;
		String result = String.format(
		"Orc { name : %s, hp : %d, armor : %d)", name, hp,amor);
		return result;
	
	}
}

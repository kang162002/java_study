package study.inherit.inherit01;

public class Parent extends GrandParent {
//	private int money;	//	 프라이빗이면 상속받은 자식들에게 적용하지않음
	// 현재 GrandParent 에 상속 받는중
	// public private default
	// public int money;
	protected int money;
	// 같은 패키지 + 자식 접근 가능한 접근 제한자 protected

//	public Parent() {
//		System.out.println("Parent() 생성자");
//	}

	public Parent(int money) {
		this.money = money;
	}

	public void say() {
		System.out.println("부모님 말씀");
	}
	
	public final void donate() {
		System.out.println("한달에 100만원 기부");
	}
	
	private void nightMeal () {
		System.out.println("야식먹기");
	}

}

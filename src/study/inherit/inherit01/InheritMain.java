package study.inherit.inherit01;

public class InheritMain {

	public static void main(String[] args) {

//		Parent p1 = new Parent ();
		Parent p1 = new Parent(1000);
		p1.say();
		p1.money = 1000;

		Child c1 = new Child();
		c1.money = 2000;
		// Child 는 부모 메소드에 상속받아 가능
		c1.say();

		Child c2 = new Child(5000);
		c2.play();

		Child c3 = new Child(3000, 4, "대흥초등학교");
		c3.say(); // 부모에있는걸 자식이 상속받아 쓸수있고
		c3.play();
		c3.printInfo();
		
		c3.donate();
		
		
//		c3.nightMeal();
	}

}

package study.practice.practice45.practice45_2;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {

	public static void main(String[] args) {


//객체 생성
//		Orderable[] Oders =
//			{new Food("족발", 19800), new Electronics("에어팟",199000), new Clothing("셔츠", 49900)};

		Food f = new Food("족발", 19800);
		
		Electronics e = new Electronics("에어팟", 199000);
		
		Clothing c = Clothing("셔츠", 49900);
		
//총합 계산
//		int total =0;
//		for(Orderable oder : Oders ) {
//			total += oder.discountedPrice();
		
//		int total = f.discountedPrice() + e.discountedPrice()+ c.discountedPrice();
		// List 방식
		List<Orderable> list = new ArrayList<Orderable>();
		list.add(new Food("족발", 19800));
		list.add(new Food("에어팟", 199000));
		list.add(new Food("셔츠", 49900));
		
		int total =0;
		for(Orderable od : list) {
			total += od.discountedPrice();
		}
		
		
//결과 출력
		System.out.println("총 할인 금액 " + total + "원");
}

	private static Clothing Clothing(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Food implements Orderable {	// 음식 
private String name;
private int price;


public Food(String name, int price) {
this.name = name;	// 	이름
this.price = price; //	가격
}
/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
@Override
public int discountedPrice() {
//	int result = (int)(price*0.9);
//	int resulit =(int)(price*90/100);
	
	return (int)(price * 0.9); // 10프로
}




}
class Electronics implements Orderable {
private String name;	// 
private int price;

public Electronics(String name, int price) {
this.name = name;
this.price = price;
}
/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
@Override
public int discountedPrice() {
	return (int)(price * 0.8);// 20프로
}
}

class Clothing implements Orderable {	
private String name;
private int price;

public Clothing(String name, int price) {
this.name = name;
this.price = price;
}
/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
@Override
public int discountedPrice(){	
//	return (int)(price * 0.7); //30프로
	return price - price* 3/10;	
}

}
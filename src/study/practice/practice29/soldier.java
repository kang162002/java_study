package study.practice.practice29;

public class soldier {

	int x =0, y=0;		// 	marine 의 위치좌표(x,y)	//	병사의 공방이 같아야한다,
	int hp = 60;		//	현재 체력
	static int weapon = 6;		// 	공격력
	static int armor = 0;		// 	방어력
	
	
//	void weaponUp () {
//		weapon++;
//	}
//	
//	void armorUp () {
//		armor++;
//	}
	static void  integration () {
		weapon ++;
		armor ++;
	}
	
	 void  move (int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	void soldier () {
	
	}
	
}

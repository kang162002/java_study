package study.practice.practice41;



public class KitchenArea extends kitchen{

	public static void main(String[] args) {
		
		// 주방공간 
		kitchen kcn = new kitchen();
		
		kcn.wallPaperColor = "하늘색";
		kcn.sizeArea = 10;
		kcn.floorHeight = 2.6;
		
		
		//냉장고
		Refrigerator rfg = new Refrigerator ();
		
		rfg.brand = "삼성";
		rfg.manyliters = 800;
		rfg.doorCount = 4;;
		
		//가스레인지
		GasStove gs = new GasStove ();
		
		gs.nurnerCount = 4;
		gs.brand = "린나이";
		gs.price = 448000;
		
		// 싱크대
		Sinks sks = new Sinks ();
		
		sks.width = 120;
		sks.length = 50;
		sks.depth = 25;
		sks.color ="은색";
		sks.quality = "스테인리스";
		
		
	}

}

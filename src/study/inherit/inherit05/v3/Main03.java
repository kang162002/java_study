package study.inherit.inherit05.v3;


import java.util.ArrayList;
import java.util.List;



public class Main03 {

	public static void main(String[] args) {

		// 청소
//		
//		FloorCleaner fc1 = new FloorCleaner();
//		FloorCleaner fc2 = new FloorCleaner();
//		FloorCleaner fc3 = new FloorCleaner();
//		
//		fc1.cleanFloor();
//		fc2.cleanFloor();
//		fc3.cleanFloor();
//		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		// Cleaner 객체에있는 저장된 변수 출력
		for(Cleaner c : list ) {
			c.doClean();
			
		}
		
	}

}

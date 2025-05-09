package study.inherit.inherit05.v1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

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
//		WindowCleaner wc1 = new WindowCleaner();
//		
//		DustCleaner dc1 = new DustCleaner();

		// 손쉽게 쓰는방법

		DustCleaner[] dustArr = new DustCleaner[3];
		// DustCleaner 에 Arr 로3 개의 공간을 만든다
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();

		ArrayList<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());

//		Set<String> set = new HashSet<String> ();
//		Map<String, Interger> map = new HashMap<String, Integer>();

		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());

		for (int i = 0; i < dustArr.length; i++) {
			dustArr[i].removeDust();
		}
		for(int i=0; i<windowList.size(); i++) {
			windowList.get(i).washWindow();
		}

	}
}

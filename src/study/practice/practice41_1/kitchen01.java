package study.practice.practice41_1;

import java.util.List;

public class kitchen01 {
		
	int floorSpace;		//몇평  24 32 16
	String wallColor;	// 검정 흰색 white beige
	int height;
	// 1.5m 2.5m 3.1m 	80cm* 60cm 	800	* 600
	
	
	//Cup cup; // 주방에 컵이있다
	
	//List 
	List<Cup> cupList; // = new ArrayList(); 로 만들수도있는 
	//컵이 여러개있다 .add (new Cup));
	
	//쓰레기통 여러개
	List<TrashCan> trashCanList;
	
	Refrigerator01 ref;
	Sink sink;
	GasRange gasrange;
	
}

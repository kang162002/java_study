package study.practice.practice27;

public class computer {

//---------------------------------		필드		---------------------------------//

	String model;		// 모델	삼성,LG
	String brand;		// 브랜드	
	int size;			// 사이즈
	
//---------------------------------		생성자	---------------------------------//	
	computer (){
		
	}
	
	computer (String brand, String model, int size) {
		this.brand = brand;
		this.model = model;
		this.size = size;
	}
	
//---------------------------------		메소드	---------------------------------//
	
	void monitor () {	// 리턴값이 없다
//		System.out.println("제조사: "+model + "모델: " +brand + "사이즈:"+size);
		System.out.printf("제조사:%s 모델명:%s 인치:%d\n", brand,model,size);
		
	}
	
	
	
}

package study.practice.practice53;

import study.api.MidFcstInfoService;

public class ApiServiceMain {


	public static void main(String[] args) {
		
		// Service 구조로 만들어진 객체 활용하는 메인
		
		// 공공데이터 API 와 데이터 통신 하는 개체
		MidFcstInfoService mService = new MidFcstInfoService();
		
		
		
		//APi service 통해서 데이터를 획득 > dto
	
		
		
		
		study.api.MidTaDTO mtDTO = mService.findMidTa("202507030600","11C20301");
	
		
		//dto 개체를 DB에 저장
		
		System.out.println(mtDTO);
		
		
		
		
		
	}

}
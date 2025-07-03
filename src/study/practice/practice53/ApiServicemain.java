package study.practice.practice53;

import study.api.MidFcstInfoService;

public class ApiServicemain {


	public static void main(String[] args) {
		
		// Service 구조로 만들어진 객체 활용하는 메인
		
		MidFcstInfoService mService = new MidFcstInfoService();
		
		study.api.MidTaDTO mtDTO = mService.findMidTa("202507030600","11C20301");
		
		System.out.println(mtDTO);
		
		
	}

}
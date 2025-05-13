package study.inter.interface02;

public interface Callable {
	//전화에 관련된 기능의 Interface 
	
	
	public int CALL_ON = 1;	 	//전화가 온다면1
	public int CALL_OFF = 2;	//전화가 안오면2
	
	public void call();
	//abstract 
	
	
	
}

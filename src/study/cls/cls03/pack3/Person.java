package study.cls.cls03.pack3;

public class Person {

	public String name;
	private String job;
	private int age;
	public boolean healthState;
	
	// boolean 타입의 퍼블리 이름은 isXXXX 가 들어간다,
	public boolean isHealthState() {
		return healthState;
	}
	public void setHealthState(boolean healthState) {
		this.healthState = healthState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

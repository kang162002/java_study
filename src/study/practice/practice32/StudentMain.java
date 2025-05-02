package study.practice.practice32;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student st = new Student();
		st.setStudent("컴공과");
		st.setGrade(202020);

		
System.out.println("학과 : " + st.Student());
System.out.println("학년 : " + st.grade());

	}

}
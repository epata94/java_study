package chapter07_additional;

public class StudentMain {
	// 명령문(Statement) 3라인

	public static void main(String[] args) {
		String[] names = {"James","Bruno","Evan","George","Henry"};
		
		Student student = new Student(names);
		student.sayHello();
	}	


}

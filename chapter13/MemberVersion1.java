package chapter13;

public class MemberVersion1 {

	// 필드
	String name;
	int age;

	// 생성자
	MemberVersion1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toSring() 메서드 재정의
	@Override
	public String toString() {
		return "("+ name + "," + age + ")";
	}
}

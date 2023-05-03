package chapter13;

public class Member {

	// 필드
	String name;
	int age;
	
	// 생성자
	Member (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toSring() 메서드 재정의
	@Override
	public String toString() {
		return "("+ name + "," + age + ")";
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	// hashCode() 메서드 재정의
	// HashSet을 적용하는 상황에 맞추어 hashCode를 오버라이딩한다.
	// HashSet에서 중복여부를 확인하기 위해 hashCode도 확인한다. 기존 hashCode는 객체 주소에 기반한 유일값을 반환한다.
	// 따라서 내용이 같다 하더라도 HashSet에서는 메모리에서 다른 위치에 있기 때문에 다른 객체로 판단한다.
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
}

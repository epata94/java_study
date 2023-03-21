package chapter08;

public class Woman extends Human{

	// 멤버 변수
	private String name;

	// 멤버 메서드
	public void womansay() {
		System.out.println("저는 여자이며 이름은 "+name+"입니다.");
	}
	
	// 상위 클래스의 오버라이드
	public void say() {
		System.out.println("저는 사람이고 여자입니다.");
	}
	
	// 생성자 정의
	public Woman(String name, String color) {
		this.name = name;
		this.color = color;
	}
}
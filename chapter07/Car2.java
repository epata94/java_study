package chapter07;

public class Car2 {

	// 필드
	String color;
	String company;
	String type;
//	아래 생성자는 총 4개로 오버로딩되었다.
// 3개의 인자를 가진 생성자가 가장 다양한 옵션으로 car 객체를 생성 한다.
// 인자가 두개, 한개 그리고 없는 기본생성자는 3개의 인자를 가진 생성자를 this키워드를 사용하여
// 재호출함으로써 사용자의 입력을 받은 필드값을 제외하고 기본 값을 지정하고 있다.
// 이렇게 함으로써 객체생성을 사용자입력값, 기본값으로 유연하게 생성하고 있다.
	Car2() {
		// 인자가 3개인 생성자를 호출: 생성자 안에서 생성자를 호출
		this("white", "기아", "경차");
	}
	
	Car2(String color, String company, String type) {

		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t) {
		this("white", com, t);
	}
	
	Car2(String t) {
		this("white", "기아", t);
	}
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}

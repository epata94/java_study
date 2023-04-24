package chapter07;

public class VarEx {

	public static void main(String[] args) {
		
		// 클래스 변수 사용
		// 클래스 변수: 공통 정보를 표현할 때 주로 사용한다. 클래스 변수는 공유된다.
		// 클래스변수 사용법: [클래스명].[클래스변수명]
		System.out.println("Avante 제조사 : "+Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		// 인스턴스 변수의 값 변경: 인스턴스에 특화된 값으로 변경
		a1.color = "화이트";
		a2.color = "블랙";
		
		// 인스턴스 변수 출력
		System.out.println("a1 색상 : "+a1.color);
		System.out.println("a2 색상 : "+a2.color);
		
		// 클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);
		
		// 클래스 변수의 값 변경: 공통 정보를 변경하고자 할 때
		a1.company = "기아";
		
		// 클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		System.out.println("Avante 제조사 : "+Avante.company);
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);
		
	
	}
	
	
}

class Avante {
	// 클래스 변수: static [자료형] [필드명]
	static String company = "현대"; // 클래스 변수: 객체를 생성하지 않고도 참조할수 있는 필드(변수)
	String color;	// 인스턴스 변수: 객체를 생성해야만 접근 가능한 필드(변수)
	
}
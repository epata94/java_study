package chapter07;

public class MethodCall {

	public static void main(String[] args) {
		
		// 직접 실행: [클래스명].[클래스메소드명];
		Method.printName();
		
		// 객체를 생성해서 실행
		Method m = new Method();
		m.printEmail();

	}

}

class Method {

	// 클래스 메서드: 공통의 목적 또는 자주 사용되는 기능: 각 인스턴스와 상관이 없는
	// 클래스 메서드: static [함수 선언]
	static void printName() {
		System.out.println("printName() 실행");
	}

	// 인스턴스 메서드
	void printEmail() {
		System.out.println("printEmail() 실행");
		
		printId(); // 다른 메서드 실행
	}
	
	void printId() {
		System.out.println("printId() 실행");
	}
}
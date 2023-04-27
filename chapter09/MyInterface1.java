package chapter09;

public interface MyInterface1 {

	// Java8버전 이후 부터 default, static 메소드를 지원함으로써
	// Field(속성)을 제외한 기능(Method)에 대해서 다중상속의 효과를 낼 수 있다.

	// default 접근 제어 속성만 가능하며 접근 범위는
	// 모든 클래스: X, 상속: O, 동일클래스: O, 동일 패키지:O
	default void defaultMethod() {
		System.out.println("MyInterface1 의 default 메서드");
	}

//	Interface static 메소드 사용법: [인터페이스명].[static 메소드]
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드");
	}
}

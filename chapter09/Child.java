package chapter09;

public class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
// 동일한 이름을 가지는 default method가 여러 인터페이스에서 정의시.
// 이를 사용하는 구현하는 클래스에서 호출하고자 할 때 이름을 구분할 수 없는 문제가 발생한다.
// 이 경우 "[인터페이스명].super.[동일한 이름의 default 메소드명] 호출함으로써 동일이름의 default 메소드에
// 접근 가능하다.
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
	
	

}

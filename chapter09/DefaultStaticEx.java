package chapter09;

public class DefaultStaticEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		//  인터페이스를 구현한 메소드
		c.defaultMethod();
		// Child에서 상속한 parent 클래스의 메소드
		c.method2();

		// 인터페이스에서 정의된 static 메소드: 생성할 필요없이 바로 호출
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();

	}

}

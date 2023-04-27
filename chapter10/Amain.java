package chapter10;

public class Amain {

	public static void main(String[] args) {
		A a = new A();
		
		//static 멤버 클래스 객체 생성
		// B클래스는 static 클래스이기 때문에 A클래스의 인스턴스 없이 생성가능하다.
		// 외부클래스.내부클래스
		// static 클래스 역시 new 생성
		// static 메소드 생성안하고 클래스.메소드() 사용, Integer.parseInt();
		// 객체는 new 또는 static 메소드나 필드를 사용하는 시점에서 로드를 한다.

		A.B b = new A.B();
		b.var1 = 3;
		b.method1();
		A.B.var2 = 3;
		A.B.method2();
		
		//인스턴스 내부 클래스 객체 생성
		// C는 A클래스의 인스턴스 내부 클래스 이기 때문에 A클래스의 인스턴스를 통해 생성한다.
		A.C c = a.new C();
		c.var1 = 3;
		c.method1();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}

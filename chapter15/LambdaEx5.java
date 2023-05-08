package chapter15;

public class LambdaEx5 {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.method();

	}
	
}

@FunctionalInterface
interface LambdaInterface5 {
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv = 40;
		LambdaInterface5 f5 = () -> {
			// 익명객체는 중첩 클래스 구조를 가지기 때문에 외부 클래스의 인스턴스 변수를 접근하기 위해서는
			// [외부클래스].this.[인스턴스 변수명] 이렇게 접근이 가능하다.
			System.out.println("Outer.this.iv:" + Outer.this.iv);
			// 람다 표현식에서 this는 람다를 감싸는 클래스의 인스턴스를 가리킴
			System.out.println("this.iv:" + this.iv);
			System.out.println("iv:" + iv);
		};
		f5.method();
	}
}
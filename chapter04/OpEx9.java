package chapter04;

public class OpEx9 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		int c = 3;
// +, - 산술 연산자 왼쪽에서 오른쪽 방향
		System.out.println(a + b - c);
		// 산술 연산에서도 *, /은 +,-보다 우선순위가 높다.
		System.out.println(a + b * c);
		
		// 괄호로 묶어 우선순위를 높여줌
		System.out.println((a + b) * c);

		// 연산자가 여러개 있을 경우에도 명시적으로 ()우선순위를 표현하는것이
		// 논리적인 에러를 방지할 수 있다.
		System.out.println(a + (b * c));

	}

}

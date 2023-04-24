package chapter07;

public class MethodEx2 {

	public static void main(String[] args) {
//		메소드 중첩호출(Method Composition)
// cf) 메소트 체인(Method Chaining): MethodChaining.java 참조
		System.out.println(divide(pow(add(3,3)))); // Step1
//		System.out.println(divide(pow(6))); // Step2: add(3,3) 수행결과가 6으로 치환된다.
//		System.out.println(divide(36)); // Step3
//		System.out.println(18); // Step4
// 위 코드는 아래와 같이 나누어 작성할 수 있다.
		int result = add(3,3);
		result = pow(result);
		result = divide(result);
		System.out.println(result);

	}

	static int add(int x, int y) {
		return x + y;
	}

	static int pow(int x) {
		return x * x;
	}

	static int divide(int x) {
		return x / 2;
	}


}

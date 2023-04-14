package chapter04;

public class OpEx5 {

//	 좌항 [논리연산자] 우항
// 좌항이나 우항은 변수, 상수, 표현식, 비교연산
	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		// AND 연산: 그리고
		System.out.println(a > b && a == 10);	// true
		System.out.println(a > b && a == b);	// false
		System.out.println(a < b && a == b);	// false

		// OR 연산: 또는
		System.out.println(a > b || a == b);	// true
		System.out.println(a < b || a == b);	// false
		System.out.println(a < b || a == 10);	// 10

		// XOR 연산
		System.out.println(a > b ^ a == 10);	// false
		System.out.println(a > b ^ a == b);		// true
		
		// NOT 연산
		System.out.println(!(a > b));	// false
		System.out.println(!(a < b));	// true
		
		
	}

}

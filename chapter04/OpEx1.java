package chapter04;

public class OpEx1 {

	public static void main(String[] args) {
		/*
		int a = 10;
		10 = a;		// 에러 1
		a + 1 = 10;	// 에러 2
		10 = 1;		// 에러 3
		a = a + 10;	// 정상
		*/
		
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1); // 10출력
//		number1 += 10;
//	nummber1 = number1+10;
// number1 = 10+10; // number1 치환
// number1 = 20; // 10+10 평가
// number1의 값이 20으로 변경
		number1 += 10; // 더하고 대입
//		number1 =+ 10; // 여기서 + 부호연산자 number1=10 관 같은의미

		System.out.println("number1 += 10 -> "+number1); // 20 출력
		number1 -= 10; // 빼고 대입
		// number1 = number1-10
		System.out.println("number1 -= 10 -> "+number1); // 10 출력
		number1 *= 2; // 곱하고 대입
		System.out.println("number1 *= 2 -> "+number1); // 20 출력
		number1 /= 2; // 나누고 대입
		System.out.println("number1 /= 2 -> "+number1); // 10 출력
		number1 %= 3 ; // 나머지 대입
		System.out.println("number1 %= 3 -> "+number1); // 1 출력
		

	}

}

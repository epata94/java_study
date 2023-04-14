package chapter04;

public class OpEx5_3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		// 분모가 0인 나눗셈은 존재하지 않는다.
		// 허용되지 않는 연산에 대해서는
		// Runtime 에러(실행오류)가 발생된다.
//		int result = a/b; //
		// & 연산
		// 논리연산은 왼쪽에서 오른쪽으로 진행
		System.out.println(b > 0 && (a / b > 0));

	}

}

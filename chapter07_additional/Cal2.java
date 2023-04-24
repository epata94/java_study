package chapter07_additional;
import java.util.*;

public class Cal2 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X		<= 여기 : 함수안에서 모든 입력, 프로그램 로직, 출력(활용)을 모두 처리하고자 할떄
	 * 		  X       O
	 * 		  O       X
	 * 		  O       O
	 */

	public static void addNumber() { // 함수 정의
		int firstNum = 0;
		int secondNum = 0;
		int result = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();

		result = firstNum + secondNum;

		System.out.println(firstNum + " + " + secondNum + " = " + result);
	}
// main 함수: 프로그램 시작할 때 최초로 호출되는 함수
// 리턴타입: 함수 호출 후 그 함수가 반환하는 값, 만약에 반환되는 값이 없다면 void로 명시
// [리턴타입] [함수명] (파라메터1, 파라메터2,.... 파라메터N){
// }
public static void main(String[] args) {
	System.out.println("main] debug1");
	// 함수사용법
	// 함수명(); <= 함수 호출, 함수의 실행문이 모두 수행되면 다시 자기 자리로 돌아온다.
	// 함수 사용의 목적
	// - 내가 작성하고자 하는 프로그램 로직을 구조화 할 수 있다.
	addNumber();
// 내가 작성하는 프로그램 로직을 모두 main함수에서 처리한다면 굉장히 큰 main 함수가 될 것이다.
//	minusNumber();
//	devideNumber();
//	multiplcaeNumber();
	System.out.println("main] debug2");
}

}

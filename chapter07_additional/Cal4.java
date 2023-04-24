package chapter07_additional;
import java.util.*;

public class Cal4 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		
	 * 		  O       X		<= 여기: 입력을 처리하고, 프로그램 로직을 수행하고 자 할떄
	 * 		  O       O
	 */
// [리턴타입] 함수명(){
//  	return [변수 또는 리터럴];
// }
// 리턴타입: 함수 수행후 호출하는부(쪽)에 값을 넘겨줄 수 있는데 그 값의 타입
// 자바에서는 함수에서 리턴 값은 한 개만 허용
	public static int addNumber() {
		int firstNum=0;
		int secondNum=0;
		int result=0;

		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();

		result = firstNum+secondNum;
//		System.out.print(firstNum + " + " +secondNum+ " = ");
		
		return result;
//		return firstNum_secondNum;
	}
	
	public static void main(String[] args) {
		int result=0;
		result = addNumber();
		// 함수 호출후 addNumber()함수 내의 모든 실행문이 수행되었을 경우 아래와 같이
		// 함수는 리턴값으로 치환된다.
		// result = 3; // 만약에 return 값이 3인 경우

		System.out.println(result);
	}

}

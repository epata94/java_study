package chapter07_additional;
import java.util.*;

public class Cal3_1 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		<=여기: 입력(로직에 필요한 데이터)은 함수외부에서 받고 프로그램 로직, 출력(활용)을 처리하고 자 할 때
	 * 		  O       X
	 * 		  O       O
	 */
	
	public static void addNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum+secondNum;
		
		System.out.println(firstNum + " + " +secondNum+ " = " + result);

	
	}
// 파라메터(매개변수, 파라미터): 함수 호출시 넘겨 주는 값
// 함수 호출시: 함수명((변수 또는 리터럴)1, (변수 또는 리터럴)2,...,(변수 또는 리터럴)N);
// 함수 정의시: [리턴타입] 함수명(자료형 파라메터1,자료형 파라메터2, ..., 자료형 파라메터N)
	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();
		
//		addNumber(15, 30); // 파라메터를 리터럴로 사용
		addNumber(firstNum, secondNum);
	}

	

}

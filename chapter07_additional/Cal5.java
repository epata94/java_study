package chapter07_additional;
import java.util.*;

public class Cal5 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		
	 * 		  O       X		
	 * 		  O       O		<= 여기 : 핵심 프로그램 로직만 처리
	 */
	
	public static int addNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum+secondNum;
		
		return result;
	}
	
	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=0;
		int result=0;
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();

		result = addNumber(firstNum, secondNum);
		
		System.out.println(firstNum + " + " +secondNum+ " = " + result);
	}

}

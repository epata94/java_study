package chapter07_additional;
import java.util.*;

public class Cal4 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		
	 * 		  O       X		<= 여기
	 * 		  O       O
	 */
	
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
		System.out.print(firstNum + " + " +secondNum+ " = ");
		
		return result;
//		return firstNum_secondNum;
	}
	
	public static void main(String[] args) {
		int result=0;
		result = addNumber();
		
		System.out.println(result);
	}

}

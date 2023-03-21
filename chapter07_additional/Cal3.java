package chapter07_additional;
import java.util.*;

public class Cal3 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		<=여기
	 * 		  O       X
	 * 		  O       O
	 */
	
	public static void addNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum+secondNum;
		
		System.out.println(firstNum + " + " +secondNum+ " = " + result);

	
	}
	
	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();
		
		addNumber(firstNum, secondNum);
	}

	

}

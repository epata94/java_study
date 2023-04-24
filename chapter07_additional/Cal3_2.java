package chapter07_additional;

import java.util.Scanner;

public class Cal3_2 {
	/*
	 * 		리턴타입	파라메터
	 * 		  X       X
	 * 		  X       O		<=여기
	 * 		  O       X
	 * 		  O       O
	 */
	
	public static void addNumber(int firstNum, int secondNum, int thirdNum) {
		int result=0;

		result = firstNum+secondNum+thirdNum;
		
		System.out.println(firstNum + " + " +secondNum+ " + "+thirdNum+" = " + result);

	
	}
// 파라메터(매개변수, 파라미터): 함수 호출시 넘겨 주는 값
// 함수 호출시: 함수명((변수 또는 리터럴)1, (변수 또는 리터럴)2,...,(변수 또는 리터럴)N);
// 함수 정의시: [리턴타입] 함수명(자료형 파라메터1,자료형 파라메터2, ..., 자료형 파라메터N)
	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=0;
		int thirdNum=0;

		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();

		System.out.print("세번째 수를 입력하세요: ");
		thirdNum = in.nextInt();

//		addNumber(15, 30); // 파라메터를 리터럴로 사용
		addNumber(firstNum, secondNum, thirdNum);
	}

	

}

package chapter07_additional;
import java.util.*;

public class Cal9 {
	// 클래스 생성하지 않고 모든 함수의 입력에서 Scanner가 필요하기 때문에 static 변수로 선언
	static Scanner in = new Scanner(System.in);
		
	public static int calculator(int firstNum, int secondNum, String operator) {
		int result=0;

		switch (operator) {
			case "+":
				result = firstNum+secondNum;
				break;
			case "-":
				result = firstNum-secondNum;
				break;
			case "*":
				result = firstNum*secondNum;
				break;
			case "/":
				result = firstNum/secondNum;
				break;
		}
		
		return result;
	}
		
	public static int[] inputNumber() {
		int[] inputs = new int[2];
		
		System.out.print("첫번째 수를 입력하세요: ");
		inputs[0] = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		inputs[1] = in.nextInt();
		
		return inputs;
	}
	
	public static String inputOperator() {
		System.out.println("다음 사직 연산중 하나를 고르세요. ");
		System.out.print("+ , - , * , / : ");
		return in.next();
	}
	
	public static void printOutput(int firstNum, int secondNum, String operator, int result) {
		System.out.println(firstNum + " " + operator + " " + secondNum+ " = " + result);
		System.out.print("계속: 1, 종료: ! =====> ");
		if (in.next().equals("!")) {
			System.out.println("연습용 계산기를 종료합니다. 이용해 주셔서 감사합니다.");
			System.exit(0);
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		int[] inputs = new int[2];
		int result=0;
		String operator=null;

		while(true) {
			inputs = inputNumber();
			operator = inputOperator();
			result = calculator(inputs[0], inputs[1], operator);
			printOutput(inputs[0], inputs[1], operator, result);
		}
	}

}

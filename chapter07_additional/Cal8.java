package chapter07_additional;
import java.util.*;

public class Cal8 {

	// Cal7을 이용하여 곱셈, 나눗셈 연산을 추가할 것
		
	public static int addNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum+secondNum;
		
		return result;
	}
	
	public static int subtractNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum-secondNum;
		
		return result;
	}
	
	public static int[] inputNumber() {
		int[] inputs = new int[2];
		
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		inputs[0] = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		inputs[1] = in.nextInt();
		
		return inputs;
	}
	
	public static void main(String[] args) {
		int[] inputs = new int[2];
		int result=0;
	
		inputs = inputNumber();
		result = addNumber(inputs[0], inputs[1]);
		
		System.out.println(inputs[0] + " + " +inputs[1]+ " = " + result);

		inputs = inputNumber();
		result = subtractNumber(inputs[0], inputs[1]);
		System.out.println(inputs[0] + " - " +inputs[1]+ " = " + result);
		
	}

}

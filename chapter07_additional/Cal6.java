package chapter07_additional;
import java.util.*;

public class Cal6 {

	// 두가지 이상의 값을 반환하려면?
	
	public static int addNumber(int firstNum, int secondNum) {
		int result=0;

		result = firstNum+secondNum;
		
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
	}

}

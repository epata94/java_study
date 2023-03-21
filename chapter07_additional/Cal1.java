package chapter07_additional;
import java.util.*;

public class Cal1 {

	// 함수를 사용하지 않는 경우
	
	public static void main(String[] args) {
	
		int firstNum=0;
		int secondNum=0;
		int result=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		firstNum = in.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		secondNum = in.nextInt();
		
		result = firstNum+secondNum;
		
		System.out.println(firstNum + " + " +secondNum+ " = " + result);

	}

}

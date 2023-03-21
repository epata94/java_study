package chapter15;

import java.util.function.BinaryOperator;

public class V4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입출력 항목이 모두 동일할 경우에는 다음의 BinaryOperator를 사용하여 더 간단하게 표현할 수 있다.
		BinaryOperator<Integer> mc = (a, b) -> a + b;;
//        int result = mc.sum(3, 4);
        int result = mc.apply(3, 4);
        System.out.println(result);  // 7 출력

	}

}

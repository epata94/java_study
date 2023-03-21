package chapter15;

import java.util.function.BiFunction;

public class V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
//        int result = mc.sum(3, 4);
        int result = mc.apply(3, 4);
        System.out.println(result);  // 7 출력

	}

}

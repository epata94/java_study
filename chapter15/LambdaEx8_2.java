package chapter15;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaEx8_2 {
	
	public static void main(String[] args) {
		Function<Integer, Integer> mySquare = (value) -> value * value;
		Integer result = mySquare.apply(3);
		System.out.println(result);
	}
	
}
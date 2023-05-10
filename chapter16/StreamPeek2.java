package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
// peek 메소드는 주로 스트림의 중간 작업이 진행시 디버그 용도로 활용한다.
		List<Integer> result = numbers.stream()
				.peek(num -> System.out.println("Processing number: " + num))
				.filter(num -> num % 2 == 0)
				.peek(num -> System.out.println("Even number: " + num))
				.collect(Collectors.toList()); // 최종작업 메소드
				
	}
}

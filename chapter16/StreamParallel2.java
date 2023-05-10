package chapter16;

import java.util.ArrayList;
import java.util.List;


public class StreamParallel2 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		// 1부터 100,000,000까지의 정수 리스트 생성
		for (int i = 1; i <= 100000000; i++) {
			numbers.add(i);
		}
		long startTime = System.currentTimeMillis();

		// Stream을 사용한 경우
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();

		long endTime = System.currentTimeMillis();
		System.out.println("Stream sum: " + sum);
		// 1s: 1000ms
		System.out.println("Stream elapsed time: " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();

		// parallelStream을 사용한 경우
		sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();

		endTime = System.currentTimeMillis();
		System.out.println("ParallelStream sum: " + sum);
		System.out.println("ParallelStream elapsed time: " + (endTime - startTime) + "ms");

	}

}

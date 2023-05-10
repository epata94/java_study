package chapter16;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap2 {

	public static void main(String[] args) {
		String[][] names = {{"John", "Mary"}, {"Alice", "Bob"}, {"Tom", "Jerry"}};

		Stream<String[]> stream = Arrays.stream(names);

		Stream<String> flatStream = stream.flatMap(s -> Arrays.stream(s));

		flatStream.forEach(n->System.out.println(n));
	}

}

package chapter16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamMapToInt {

    public static void main(String[] args) {

// 기본타입의 Stream 전환
// 1차열 배열
        int[] arr = new int[]{1,2,3,4,5,6};

        // 배열전체 Stream 객체로 변환 => 기본타입에 맞는 스트림으로 생성
        IntStream stream1 = Arrays.stream(arr);
        // 나머지 사용법은 동일
        stream1.forEach(s -> System.out.print(s+" "));
        System.out.println();

        int[][] arr2 = new int[][]{
                {1,2},
                {3,4},
                {5,6}
        };
        // 2차원은 flatMapToInt 메소드를 활용한다.
        IntStream stream2 = Arrays.stream(arr2).flatMapToInt(Arrays::stream);
        stream2.forEach(s -> System.out.print(s+" "));

        // 기본 Stream을 활용한 예제
        Stream<int[]> stream3 = Arrays.stream(arr2);
        Stream<Integer> stream4 = stream3.flatMapToInt(Arrays::stream).boxed();
        System.out.println();
        stream4.forEach(s->System.out.print(s+" "));
    }
}

package chapter16;
import java.util.*;

public class StreamApply2 {

	public static void main(String[] args) {
		// 이 배열에서 짝수만 찾아 중복을 제거한 후에 역순으로 정렬하는 프로그램을 작성

		int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 걸러낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
        
        for(int i = 0; i<result.length; i++)
        	System.out.println(result[i]);
	}
}

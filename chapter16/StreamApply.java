package chapter16;
import java.util.*;

public class StreamApply {

	public static void main(String[] args) {
		// 이 배열에서 짝수만 찾아 중복을 제거한 후에 역순으로 정렬하는 프로그램을 작성

		int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data).boxed().filter((a) -> a % 2 == 0).distinct().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        
        for(int i = 0; i<result.length; i++)
        	System.out.println(result[i]);
	}
}

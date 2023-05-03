package chapter12;
import java.util.Arrays;
public class P344 {
    public static void main(String[] args) {
        int[] iValues = { 5, 2, 9, 1, 5, 6 };
        String[] names = { "김민수", "이영희", "박철수", "정지영", "홍길동", "최민호", "한지영" };

        // 배열을 정렬합니다.
        Arrays.sort(iValues);

        System.out.println("* 숫자 타입 배열값 정렬 결과");
        // 정렬된 배열을 출력합니다.
        for (int iValue:iValues) {
            System.out.print(iValue + " ");
        }

        Arrays.sort(names);
        System.out.println("\n");
        System.out.println("* 문자 타입 배열값 정렬 결과");
        for(String name:names){
            System.out.print(name+" ");
        }
    }
}

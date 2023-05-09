package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStreamBefore {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김유신", "홍길동", "이순신", "홍길동", "유관순");

        // 중복 제거를 위해 새로운 리스트 생성
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (!newList.contains(str)) {
                newList.add(str);
            }
        }

        // "홍"으로 시작하는 문자열 출력
        for (String str : newList) {
            if (str.startsWith("홍")) {
                System.out.println(str);
            }
        }
    }
}

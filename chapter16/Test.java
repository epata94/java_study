package chapter16;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"홍길동", "김유신", "이순신", "유관순"});
//        List<String> list2 = {"홍길동", "김유신", "이순신", "유관순"};
        System.out.println("내부 반복자 이용");
        list.stream().forEach(s ->System.out.println(s));
    }
}

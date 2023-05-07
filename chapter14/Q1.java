package chapter14;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {
        // String 타입을 저장할 ArrayList 생성
        ArrayList<String> list = new ArrayList<String>();

        // ArrayList에 요소 추가
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // ArrayList 크기 출력
        System.out.println("ArrayList size: " + list.size());

        // ArrayList 요소 순회
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

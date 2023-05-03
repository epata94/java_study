package chapter13;
import java.util.ArrayList;
public class ListEx3_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //int[] i
        // ArrayList의 내부 값은 어떠한 타입도 add 할수 있다.
        list.add("Hello");
        list.add(123);
        list.add(true);

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof String) {
                System.out.println("String: " + obj);
            } else if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } else if (obj instanceof Boolean) {
                System.out.println("Boolean: " + obj);
            }
        }
    }
}

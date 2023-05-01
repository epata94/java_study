package chapter12;
import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        System.out.print("제거할 문자를 입력하세요: ");
//        char target = scanner.nextLine().charAt(0);
        String target = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(input);
        int index;
//        while ((index = buffer.indexOf(target) != -1) {
//            buffer.deleteCharAt(index);
//        }

        System.out.println("제거된 문자열은 다음과 같습니다: " + buffer);
//        System.out.println("제거된 문자열은 다음과 같습니다: " + buffer.toString());
    }
}

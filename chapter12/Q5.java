package chapter12;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(input.trim());
//        StringBuffer buffer = new StringBuffer(input);

        System.out.println("앞뒤 공백이 제거된 문자열은 다음과 같습니다: " + buffer);
    }
}


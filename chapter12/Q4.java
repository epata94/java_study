package chapter12;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(input);
        buffer.reverse();

        System.out.println("입력한 문자열의 역순은 다음과 같습니다: " + buffer.toString());
    }
}


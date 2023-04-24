package chapter05;
import java.util.Scanner;
public class DoWhileQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("입력한 정수들의 합은 " + sum + "입니다.");
    }
}

package chapter05;
import java.util.Scanner;
public class BreakQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료됩니다.): ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 0을 입력하면 반복문을 종료합니다.
            }

            sum += number;
        }

        System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
    }
}

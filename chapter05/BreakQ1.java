package chapter05;
import java.util.Scanner;
public class BreakQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
            number = scanner.nextInt();

            if (number == 50) {
                System.out.println("50을 입력했습니다. 프로그램을 종료합니다.");
                break; // 50을 입력하면 반복문을 종료합니다.
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}

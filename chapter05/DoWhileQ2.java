package chapter05;
import java.util.Scanner;
public class DoWhileQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("양의 정수를 입력하세요: ");
            number = scanner.nextInt();
            sum += number;
        } while (sum < 100);

        System.out.println("입력된 숫자의 합이 100을 넘었습니다. 프로그램을 종료합니다.");
    }
}

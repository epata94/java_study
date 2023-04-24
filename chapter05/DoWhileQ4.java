package chapter05;
import java.util.Scanner;
public class DoWhileQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("구구단을 출력할 숫자(2~9)를 입력하세요: ");
            number = scanner.nextInt();
        } while (number < 2 || number > 9);

        System.out.println(number + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

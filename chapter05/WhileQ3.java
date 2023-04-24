package chapter05;
import java.util.Scanner;
public class WhileQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요: ");
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

package chapter05;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int max;
        if (num1 > num2) {
            max = num1;
//            System.out.println("두 정수 중에서 큰 수는 " + num1 + "입니다.");
        } else {
            max = num2;
//            System.out.println("두 수 중에서 큰 수는 " + num2 + "입니다.");
        }
//
        System.out.println("두 수 중에서 큰 수는 " + max + "입니다.");
    }
}

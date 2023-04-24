package chapter07;
import java.util.Scanner;
public class MethodQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        int result = getMax(num1, num2);

        if (result == 0) {
            System.out.println("두 수는 같습니다.");
        } else {
            System.out.println("두 수 중에서 더 큰 수는 " + result + "입니다.");
        }
    }

    public static int getMax(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

package chapter05;
import java.util.Scanner;
public class WhileQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.println(num);
            num--;
        }

        sc.close();
    }
}

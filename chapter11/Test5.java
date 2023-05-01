package chapter11;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =0;
        int sum=0;

        System.out.print("정수를 입력하세요: ");
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i=1; i<=number; i++) {
            sum+=i;
        }

        System.out.println("1부터 "+number+"까지의 합은 "+sum+"입니다.");
    }
}

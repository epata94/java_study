package chapter05;
import java.util.Scanner;
public class SwQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 3사이의 정수를 입력하세요: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("입력한 숫자는 1입니다.");
                break;
            case 2:
                System.out.println("입력한 숫자는 2입니다.");
                break;
            case 3:
                System.out.println("입력한 숫자는 3입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}

package chapter07;
import java.util.Scanner;

public class Prac4 {

    public static String cal(int num) {

        int mod = num % 2;
        String result = (mod == 0) ? "짝수" : "홀수";

        return result;
    }
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        num = sc.nextInt();

        String result = cal(num);
        System.out.println(num + "은(는) " + result + "입니다.");

    }
}

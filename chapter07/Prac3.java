package chapter07;
import java.util.Scanner;

public class Prac3 {

    public static String cal() {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("정수를 입력하세요: ");
        num = sc.nextInt();

        int mod = num % 2;
        String result = (mod == 0) ? "짝수" : "홀수";

        return result;
    }
    public static void main(String[] args) {
        String result;
        result = cal();

//        System.out.println(num + "은(는) " + result + "입니다.");
    }
}

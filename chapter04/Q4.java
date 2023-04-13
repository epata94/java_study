package chapter04;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("정수를 입력하세요: ");
        num = sc.nextInt();

        int mod = num % 2;
        String result = (mod == 0) ? "짝수" : "홀수";

        System.out.println(num + "은(는) " + result + "입니다.");
    }
}

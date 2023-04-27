package chapter08;
import java.util.Scanner;
public class RealAbstractClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요: ");
        String num1 = scanner.next();
        System.out.print("첫 번째 수를 입력하세요: ");
        String num2 = scanner.next();
        int iValue=10; // 기본 타입, 값만 저장
// 정수의 덧셈
//        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
// 실수의 덧셈
        double result = Double.parseDouble(num1)+Double.parseDouble(num2);


        System.out.println(num1+" + "+num2 + " = "+result);
    }
}

package chapter04;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// println: 메세지를 출력하고 줄바꿈
// print: 메세지만 출력
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int result = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+result);
    }
}

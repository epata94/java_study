package chapter07;
import java.util.Scanner;
public class MethodQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("두 수의 합: " + add(num1, num2));
        System.out.println("두 수의 차: " + subtract(num1, num2));
        System.out.println("두 수의 곱: " + multiply(num1, num2));
        System.out.println("두 수의 몫: " + divide(num1, num2));
        System.out.println("두 수의 나머지: " + modulo(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
}

package chapter07;
//import java.util.Scanner;
//import java.util.Random;
// 패키지.* 문법을 사용하면 모든 클래스를 import 할 수 있어서 코드 사이즈는 줄어들수 있지만
// 해당 클래스를 메모리에 로드해야하고 내가 import 하는 클래스를 정확히 파악할 수 없는 문제가 있기 때문에
// 가급적 사용하는 클래스를 지정하는 것이 좋다.
import java.util.*;
public class MethodQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();
        Random random = new Random();

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

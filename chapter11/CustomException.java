package chapter11;
import java.util.Scanner;
public class CustomException {
    public static void throwExceptions() throws MyException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요.: ");
        int num1 = sc.nextInt();
        System.out.println("두번째 수를 입력하세요.: ");
        int num2 = sc.nextInt();
        if (num1 < 0) {
            // 고객의 요구사항에 도출된 룰: 비지니스룰
            throw new MyException("저희는 첫번째 수가 특별히 양수만을 지원하는 비지니스 룰이 있습니다.");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public static void handleExceptions() {
        try {
            throwExceptions();
        } catch (MyException e) {
            System.out.println("비지니스 예외 " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("런타임 예외: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleExceptions();
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
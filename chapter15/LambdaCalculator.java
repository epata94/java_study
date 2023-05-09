package chapter15;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class LambdaCalculator {
    public static void main(String[] args) {
        System.out.println("람다 계산기: 두 수에 대한 사칙연산 기능 제공");
        Supplier<Double> inputNumber = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("수를 입력하세요: ");
            return scanner.nextDouble();
        };

        double num1 = inputNumber.get();
        double num2 = inputNumber.get();
/**
 *  Operator는 Funtion 인터페이스의 하의 인터페이스이기 때문에 입력(파라메터,매개변수), 출력(return)이 있다는 점이 공톰점이다.
 *  아래 부분이 Operator의 특징이다.
 *  -  매개변수의 연산결과를 return한다.
 *  - 매개변수간 연산 결과를 return 하기 때문에 매개변수, 리턴타입이 동일하다.
 */
        BinaryOperator<Double> add = (a, b) -> a + b;
        BinaryOperator<Double> subtract = (a, b) -> a - b;
        BinaryOperator<Double> multiply = (a, b) -> a * b;
        BinaryOperator<Double> divide = (a, b) -> a / b;

        System.out.println(num1 + " + " + num2 + " = " + add.apply(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract.apply(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply.apply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide.apply(num1, num2));

    }
}

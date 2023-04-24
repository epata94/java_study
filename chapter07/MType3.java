package chapter07;
import java.util.Scanner;

public class MType3 {
    public static int printBigNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int max = num1 > num2 ? num1 : num2;
        scanner.close();
        return max;
    }
    public static void main(String[] args) {


        int max = printBigNumber();
        System.out.println("입력받은 두 정수 중에서 큰 수는 " + max + "입니다.");

    }
}

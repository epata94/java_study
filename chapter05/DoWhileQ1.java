package chapter05;
import java.util.Scanner;
public class DoWhileQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;

        do{
            System.out.print("100보다 작거나 같은 양의 정수를 입력하세요: ");
            number = scanner.nextInt();
//양의 정수를 입력받아, 입력된 정수가 100보다 작거나 같을 때까지
        }while((number<=0) || (number>100) );
        System.out.println(number+"을(를) 입력하셨습니다. 프로그램을 종료합니다.");
    }
}

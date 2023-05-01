package chapter11;
import java.util.Scanner;
public class NoneStopDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("첫번째 수를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 수를 입력하세요: ");
            String numInput = scanner.next();

            if (numInput.equals("q")){
                break;
            }
            int num2 = Integer.parseInt(numInput);
            try {
                int result = num1/num2;
                System.out.println("나눈 결과: "+result);
//            }catch (ArithmeticException ex){
                /**
                 *  Exception 클래스는 모든 런타임 예외 클래스의 부모 클래스이므로
                 *  Exception 클래스로 모든 런타임 예외 클래스를 처리 할 수 있다. (초보자에게 권장)
                 */
            }catch (Exception ex){
                System.out.println("예외발생: "+ex);
                System.out.println("예외원인: 두번째 인자가 0입니다. 숫자는 0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }

}

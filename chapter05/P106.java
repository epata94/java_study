package chapter05;
import java.util.Scanner;
public class P106 {
    public static void main(String[] args) {
        int iValue=0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("값을 입력하세요(-1 종료): ");
            // 리얼타임 프로그램 로직
            iValue = scanner.nextInt();

            if(iValue == -1){
                break;
            }

        }while(true);
    }
}

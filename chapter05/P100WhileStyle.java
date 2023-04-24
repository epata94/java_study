package chapter05;
import java.util.Scanner;
public class P100WhileStyle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (input != 3) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1. 계산기");
            System.out.println("2. 로또번호 생성기");
            System.out.println("3. 종료");
            System.out.print("선택: ");

            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("계산기를 실행합니다.");
                    break;
                case 2:
                    System.out.println("로또번호 생성기를 실행합니다.");
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}

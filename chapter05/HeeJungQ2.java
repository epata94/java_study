package chapter05;
import java.util.Scanner;
public class HeeJungQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.println("시험시작입니다.");
        System.out.println("시험점수를 입력하세요: ");
        score = scanner.nextInt();
        if (score >=70) {
            System.out.println("합격을 축하드립니다. 점수는 "+score+"점입니다.");
        }
        System.out.println("시험이 종료되었습니다.");
    }
}

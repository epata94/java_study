package chapter05;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국영수 총점을 입력하세요: ");
        int total = sc.nextInt();
        char level;

        if (total >= 270) {
            level = 'A';
        } else if (total >= 240) {
            level = 'B';
        } else if (total >= 210) {
            level = 'C';
        } else if (total >= 180) {
            level = 'D';
        } else {
            level = 'F';
        }

        System.out.println("당신은 " + level+ "레벨입니다.");

        sc.close();
    }
}

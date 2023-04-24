package chapter05;
import java.util.Scanner;
public class SwQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월 입력(1~12): ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못된 입력";
                break;
        }

        System.out.printf("%d월은 %s입니다.\n", month, season);
    }
}

package chapter05;
import java.util.Scanner;
public class SwQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        scanner.close();

        int days;
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println("The number of days in month " + month + " is " + days);
    }
}

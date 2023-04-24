package chapter06;
import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요.");

        // 5개의 정수 입력받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력받은 정수 출력
        System.out.print("입력된 정수: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 입력받은 정수 중 가장 큰 수 출력
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\n가장 큰 수: " + max);

        // 입력받은 정수 중 가장 작은 수 출력
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("가장 작은 수: " + min);
    }
}

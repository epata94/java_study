package chapter06;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 7, 3, 2, 8, 9, 1, 6, 4 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("가장 작은 수와 가장 큰 수의 차이는 " + diff + "입니다.");
    }
}

package chapter07;

public class MethodQ3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 9};
        int max = findMax(arr);
        System.out.println("가장 큰 수: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

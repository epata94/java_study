package chapter16;

public class StreamOptionalNoAggregateMethod {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i=0;i<100;i++) {
            arr[i] = i+1;
        }

        // 요소들의 갯수
        long count = arr.length;
        System.out.println("요소들의 갯수 : " + count);

        // 요소들의 합
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("요소들의 합 : " + sum);

        // 요소들 중 첫번째 값
        int first = arr[0];
        System.out.println("요소들 중 첫번째 값 : " + first);

        // 요소들 중 최대 값
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("요소들 중 최대 값 : " + max);

        // 요소들 중 최소 값
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("요소들 중 최소 값 : " + min);

        // 요소들의 평균
        double avg = sum / (double)count;
        System.out.println("요소들의 평균 : " + avg);
    }
}

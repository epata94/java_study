package chapter05;

public class ContinueQ1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue; // 3의 배수인 경우에는 다음 숫자로 건너뜁니다.
            }

            sum += i;
        }

        System.out.println("1부터 100까지의 숫자 중에서 3의 배수를 제외한 숫자들의 합은 " + sum + "입니다.");
    }
}

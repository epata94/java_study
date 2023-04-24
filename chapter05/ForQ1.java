package chapter05;

public class ForQ1 {
    public static void main(String[] args) {
        // for문은 N번 반복하는 로직
        // 데이터를 포함한 변수의 모든 요소를 검색할떄
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

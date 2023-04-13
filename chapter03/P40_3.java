package chapter03;

public class P40_3 {
    public static void main(String[] args) {
        // 우리가  변수를 사용해야 하는 이유 (웹프로그램 기준)
        // 클라이언트에서 전송된 가변값을 처리하기 위해서
        int firstNumber;
        int secondNumber;
        int result;

        firstNumber = 10; // 10이라는 값은 어디선가 넘어오는 값
        secondNumber = 20;
        result = firstNumber+secondNumber; // 백엔드 처리 로직

        System.out.println(result);

    }
}

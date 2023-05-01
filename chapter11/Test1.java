package chapter11;


public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test1.main 1");
        int result = 1 / 0; // 에러가 발생하게 되면 멈추게 되는 상황
        // 실행해야 알수 있는 에러를 런타임 에러(오류)라고 한다.
        // 예외처리는 이러한 런타임 에러를 처리하는 메카니즘이다.
        System.out.println(result);
        System.out.println("Test1.main 2");
//        System.out.println("Test1.main 3") 문법 오류는 수행하기 전에 알수 있다.
        System.out.println("Test1.main 프로그램 종료");
    }
}

package chapter07;

public class MethodChaining {
    public static void main(String[] args) {
        String message = new String("Hello, world!");
// 메소드 체이닝 호출: 메소드A().메소드B()... // 실행 순서는 왼쪽에서 오른쪽 방향으로
// 메소드의 리턴값이 객체로 반환되고 해당객체가 또 다른 인스턴스 메소드를 가지고 있는 경우
// dl
        String greeting = message.toUpperCase().substring(0,5); // step1
//        String greeting = "Hello, world!".toUpperCase().substring(0,5); // step2
//        String greeting = "HELLO, WORLD!".substring(0,5); // step3
//        String greeting = "HELLO"; // step4
        System.out.println(greeting);
        // method compisition과 chaining이 함께 사용된 경우
        System.out.println(message.toUpperCase().substring(0,5));
    }
}

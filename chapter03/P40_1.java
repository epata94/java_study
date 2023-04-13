package chapter03;

public class P40_1 {
    public static void main(String[] args) {
        // 변수: 바뀔수 있는 값
        // 변수 선언
        // [자료형] [변수명];
        int a; // int 자료형인 a라는 변수를 사용하겠다고 선언 (Declaration)
        a=10; // a변수의 값에 10을 할당 (Assign)
        int newValue = 30; //변수는 선언과 동시에 값을 할당(초기화:Initialization)할 수 있다.

        System.out.println(a); // 변수 a의 값을 콘솔에 출력
        a=20;
        System.out.println(a); // 변수 a의 값을 콘솔에 출력
        System.out.println(newValue); // 변수 a의 값을 콘솔에 출력
    }
}

package chapter04;

public class P65 {

    // 값을 넣고 Ctrl+Alt+c: 인텔리제이에서 상수를 자동적으로 생성
    public static final double PI = 3.141592;

    public static void main(String[] args) {
        // 값을 넣고 Ctrl+Alt+v : 인텔리제이 변수 타입 변수명 자동생성, 이후 변수명은 바꿀수 있다.
        int a = 10;
        int b = 5;
// 비교연산의 결과는 boolean타입(true/false)으로 반환된다.
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a != b);

        int i = 4;
        int i2 = 5;
//        i=i2;
        System.out.println(i=i2);

       boolean c = a==b;
       boolean d = c==false;
    }
}

package chapter04;

public class P58 {
    public static void main(String[] args) {
        int a = 10; // OK
//        a+1 = 10; // 에러 (대입을 하는 변수에 표현식은 허용 X)
//        10=1; // 에러 (오퍼랜드간 대입 X)
        a = a+10; // OK (우항에 표현식은 OK)
    }
}

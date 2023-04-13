package chapter03;

public class P41 {
    public static void main(String[] args) {
        int firstVariable; // 대문자 가능
        int variable1;  // 숫자가능
        int Variable1;  // 변수명은 대소문자에 의해 구분가능
        // 인텔리제이에서는 문법 오류에 대해서 빨간색 또는
        // 빨간색 밑줄로 미리 알려준다.
        // 마우스오버하면 문법오류를 알수있다.
//        int first Variable; // 공백 사용 불가
//        int 1variable; // 변수는 숫자로 시작할 수 없다.
        // 예약어: Java문법을 위해 사용된 이름 (예: public static void)
//        int public; // 예약어는 변수로 사용불가

        variable1 =10;
        Variable1 =20;

        System.out.println(variable1);
        System.out.println("프로그램 종료");
    }
}

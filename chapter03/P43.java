package chapter03;

public class P43 {
    public static void main(String[] args) {
        byte b = 1;
        long lValue=1000;

        System.out.println(b);
//        b = 128; // byte타입의 양수 최대범위(127)을 초과한 값을 할당했기 때문에
//                 에러발생














        // 인텔리제이에서 변수를 Ctrl+마우스 왼쪽클릭 하면 선언부(선언한 곳)로 이동한다.
        lValue = 2000L; // 뒤에 L을 붙이면 명시적으로 long타입임을 표시 (가독성을 높이기 위해서)

        System.out.println(b);
        System.out.println(lValue);
        System.out.println("프로그램 종료");
    }
}

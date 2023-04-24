package chapter05;
import java.util.Scanner;
public class P92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        // 콘솔에서 문자열을 입력 받으로면 scanner.next()를 사용해야 한다.
        String password= scanner.next();
// 문자열 비교할 경우. 문자열변수.equals("비교할 문자")
// 문자열과 비교할 문자가 같으면 true, 틀리면 flase
        if (password.equals("abc")){
            System.out.println("인증되었습니다. 사용한 패스워드: "+password);

        }
    }
}

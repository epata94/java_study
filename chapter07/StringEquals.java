package chapter07;

import java.util.Scanner;
public class StringEquals {
    public static void main(String[] args) {
        String password="1234";
        checkPassword(password);
    }

    public static void checkPassword(String password) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("패스워드를 입력하세요: ");
        String inputStr = scanner.next();
        if(inputStr.equals(password)){
            System.out.println("승인되었습니다.");
        }else {
            System.out.println("패스워드가 틀립니다.");
        }
    }
}

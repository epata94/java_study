package chapter11;

import java.util.Scanner;

public class ExceptionEx8 {
	
	static String user_id = "seo";
	static String user_pw = "smg1234";

	public static void main(String[] args) throws Exception {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 : ");
			String input_id = scan.nextLine();
			
			System.out.print("비밀번호 : ");
			String input_pw = scan.nextLine();
		// 사용자 정의 예외 클래스는 Java에서 정의한 예외가 아닌
		// 주로 반드시 처리해야하는 비지니스 로직에 관련된 오류 상황을 정의하고자 할 떄 사용.
			if (!user_id.equals(input_id)) { // 비니지스 로직
				throw new LoginException("아이디가 올바르지 않습니다.");
			} else if (!user_pw.equals(input_pw)) { // 비니지스 로직
				throw new LoginException("비밀번호가 올바르지 않습니다.");
			} else {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}

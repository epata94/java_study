package chapter07_additional;

public class Method2 {
	// 명령문(Statement) 13라인
	
	public static void sayHello() {
		System.out.println("교실에 입장하셨습니다.");
		System.out.println("출석체크하세요.");
		System.out.println("오늘도 화이팅입니다.\n");
		
	}

	public static void main(String[] args) {
		System.out.println("James님 안녕하세요.");
		sayHello();
		
		System.out.println("Bruno님 안녕하세요.");
		sayHello();

		System.out.println("Evan님 안녕하세요.");
		sayHello();

		System.out.println("George님 안녕하세요.");
		sayHello();
		
		System.out.println("Henry님 안녕하세요.");
		sayHello();
	}

}

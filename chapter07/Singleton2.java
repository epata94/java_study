package chapter07;

public class Singleton2 {

	// static 변수
	private static Singleton2 instance = new Singleton2();
	private int magic_number;
	
	// 생성자에 private 접근 제한자
	private Singleton2() {
		System.out.println("객체 생성");
	}
	
	public void set_magic_number(int param) {
		magic_number = param;
	}
	
	public int get_magic_number() {
		return magic_number;
	}
	
	// static 메서드
	public static Singleton2 getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
}

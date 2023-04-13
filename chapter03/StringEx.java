package chapter03;

public class StringEx {

	public static void main(String arg[]) {
		
		String name; // 변수 선언
		name = "홍길동"; // 변수 초기화
		
		String name2 = "홍길동"; // 선언과 동시에 초기화
		// null; 참조자료형 데이터가 할당되지 않았다
		String name3 = null;   // null값으로 초기화
		String name4 = "";     // ""(Empty String)값으로 초기화

		System.out.println("name2="+name2);
		System.out.println("name3="+name3);
		System.out.println("name4="+name4);
	}

}

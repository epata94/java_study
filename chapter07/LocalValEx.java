package chapter07;

public class LocalValEx {

	public static void main(String[] args) {
	
		Local local = new Local(); // [클래스명](); <= 기본생성자: 클래스의 인스턴스를 생성, 필드에 대한 초기화는 X
		
		System.out.println(local.name); // null
		
		local.process();
		System.out.println(local.name); // 홍길동
		
		local.printAge1();
		local.printAge2();
		
		// for문 블록 내에서의 변수 선언
		for (int i=0; i<10; i++) {
			int temp = 0;
			temp += i;
		}
		
		//System.out.println(temp); // 에러

	}

}
// 자바에서 스코프(Scope)는 같은 {}에 있는 코드(실행문)를 말한다.
class Local {
	// 클래스변수 또는 인스턴스 변수: 힙메모리에 저장
	// 클래스변수와 인스턴스 변수의 생명주기는 객체 소멸시
	String name;
//	String name; // 같은 스코프에 같은 이름의 변수를 사용할 수 없다.
	
	void process() {
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20; // 지역변수: 스택에 저장, 지역변수의 생명주기는 함수 실행중
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; // 지역변수: 서로 다른 스코프에 있는 지역변수는 같은 이름을 써도 무방하다.
		System.out.println(age);
	}
	
}

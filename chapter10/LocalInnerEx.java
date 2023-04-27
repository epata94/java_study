package chapter10;

public class LocalInnerEx { // 바깥클래스
	int i=10;

// 내부 클래스(Inner) 클래스를 사용하는 경우
// 1.로직에 밀접한 영향이 있는 간단한 클래스의 경우 외부에 정의하는 것보다
// 내부에서 정의함으로써 코드의 가독성을 높일 수 있다.
// 2. 동일한 클래스안에 정의가 되기 때문에 외부/내부 클래스간 필드/메소드 참조 및 호출이 자유롭다.
// 단점.
// 1. 다른 클래스에서 쉽게 재 사용할 수 없다.
// 2. 구조화된 프로그램 개발이 어려울 수 있다.
// 3. 복잡한 클래스는 오히려 외부로 정의하는 것이 유리하다.
	void outerMethod(){
		class Inner { // 로컬 클래스
			int x=20; // 메서드 지연변수
			int i=30; // 메서드 지역변수
			void innerMethod() {
				System.out.println(x);
				System.out.println(i); // 안쪽 클래스의 i변수
				System.out.println(this.i); // 안쪽 클래스의 i변수
				System.out.println(LocalInnerEx.this.i); // 바깥 클래스의 i변수
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}
	
}

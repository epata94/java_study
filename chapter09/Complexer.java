package chapter09;

// Complexer 구현 클래스는 Printer, Scanner, Fax 인터페이스를 구현(Implemnt)한다.
// 자식클래스는 오직 하나의 추상클래스만 상속받을 수 있다. 반면에 구현클래스는 여러개의 인터페이스를 구현할수 있다.
// 자바에서는 다중상속을 허용하지 않는다. 다만 인터페이스를 통하여 다중상속의 효과를 낼 수 있다.
// 추상클래스와 인터페이스의 공통점은 모두 설계를 담당
// 자식클래스와 구현클래스의 공통점은 모두 구현을 담당
public class Complexer implements Printer, Scanner, Fax {

	// send, recieve메소드는 Fax 인터페이스의 추상 메소드를 구현
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 "+tel+"로 FAX 전송");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 "+FAX_NUMBER+"로 FAX 수신");
		
	}

	// scan 메소드는 Scanner 인터페이스의 추상메소드를 구현
	@Override
	public void scan() {
		System.out.println("스캔 실행");
		
	}

	// print 메소드는 Printer 인터페이스의 추상메소드를 구현
	@Override
	public void print() {
		System.out.println("출력 실행");
		
	}

	
}

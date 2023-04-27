package chapter09;

public class ComplexerMain2 {

	public static void main(String[] args) {

		//
		Fax fax = new Fax() {

			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
				
			}

			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive()");
				
			}
			
		};
		// fax는 FAX 인터페이스의 객체(인터페이스는 생성 불가)가 아니라
		// FAX 인터페이스를 구현한 익명클래스의 객체.
		fax.send("1234");
		fax.receive("5678");
	}
}

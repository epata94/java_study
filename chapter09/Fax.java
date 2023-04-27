package chapter09;

public interface Fax {

	// FAX번호에 대한 규격을 정의(변경X)
	String FAX_NUMBER = "02-1234-5678";
	// 팩스 송신, 수신 기능에 대한 코드 설계
	void send(String tel);
	void receive(String tel);
	
}

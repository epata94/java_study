package chapter08.poly;

public class ObjectEx {

	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia()); // toString() 재정의
		allObject("안녕"); // new String("안녕") 처럼 스트링 클래스의 인스턴스가 넘어간다.
	}
	
	public static void allObject(Object obj) {
		String str;

		// Object 클래스에서 toString은 객체의 정보를 출력한다.
		// 패키지.클래스명.식별자
		// String클래스인 경우는 toString()메소드를 오버라이딩하였다.
		// String클래스의 toString메소드는 String 클래스의 값을 출력한다.
		System.out.println(obj.toString());
		
	}

}

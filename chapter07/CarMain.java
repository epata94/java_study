package chapter07;

public class CarMain {

	public static void main(String[] args) {
	// 클래스 생성하는 법
	// [클래스명] [객체명(Instance)] = new [클래스명]();
		Car tico = new Car();
		Car pride = new Car();

		// 필드의 값에 접근하는 방법은
		// 객체.필드 <= 읽기와 쓰기가 가능합니다.
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";

		// 객체의 메소드를 접근하려면
		// 객체.메소드
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
		
	}
}

package chapter08.poly;

public class Nvidia extends GraphicCard {

	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}

	public String toString(){ // Object 부모클래스의 toString() 재정의
		return "Nvidia 인스턴스";
	}
}

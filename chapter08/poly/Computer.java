package chapter08.poly;

public class Computer {
	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process(); // 원래 그래픽카드 process


		// 사용자는 그래픽처리 관련 업무를 process() 메소드만 면된다. GraphicCard 클래스의 인스턴스를 통해서
		// Amd, Nvidia는 신경쓰지 않아도 된다.
		// Adm, Nvidia는 마치 부품처럼 교체될 수 있다.
		// 부모-자식 클래스간에서 자식의 인스턴스를 교체하면서 동일한 인터페이스를 사용하면서 큰틀에서는 동일한 기능을 수행하지만
		// 자식 클래스에서 제공하는 특별한 부가기능을 수행하는 방식으로 객체 지향의 다형성을 지원한다.
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();

	}

}

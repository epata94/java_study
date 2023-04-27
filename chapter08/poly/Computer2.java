package chapter08.poly;

public class Computer2 {

	public static void main(String[] args) {
		
		Game g = new Game();

// 매소드를 호출 할 때 매개변수 타입이 부모타입인 경우
// 부모타입의 인자, 자식타입의 인자가 모두 가능하다.
		GraphicCard gc = new GraphicCard();
		g.display(gc);

//		Amd는 GraphicCard의 Child 클래스
		Amd gc2 = new Amd();
// 부모타입이 GraphicCard로 AMD 자식 타입보다 범위가 넓기 때문에 자식타입의 인자로 호출 가능하다.
		g.display(gc2);
//		Nvidia는 GraphicCard의 Child 클래스
// 다른 자식타입의 인자(AMD->Nvidia)로 호출함으로써 displapy 메소드의 다형성을 보장한다.
		Nvidia gc3 = new Nvidia();
		g.display(gc3);

	}

}

package chapter08;

public class UpcastTest {
	public static void main(String[] args) {

		Human[] h = new Human[2];
		Man m = new Man("김민수","황색");
		Woman w = new Woman("애니","흰색");
		h[0] = (Human)m;
		h[1] = (Human)m;
		
		//처음부터 선언하기
		Human[] h2 = new Human[2];
		h2[0] = new Man("스미스","검은색");
		h2[1] = new Woman("이익순","흰색");

	}
}

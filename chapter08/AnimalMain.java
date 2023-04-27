package chapter08;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[4];

		// 서로 다른 자식클래스를 공통의 부모클래스의 배열로 관리할 수 있다.
		// 자식클래스는 부모클래스로 형변환이 가능하고 자신의 특성, 메소드를 유지 할 수 있기 떄문이다.
		Animal eagle = new Eagle("조류", "독수리");
		Animal tiger = new Tiger("포유류", "호랑이");
		Animal lion = new Lion("포유류", "사자");
		Animal shark = new Shark("어류", "상어");
		
		ani[0] = eagle;
		ani[1] = tiger;
		ani[2] = lion;
		ani[3] = shark;
		
		for (int i=0; i<ani.length; i++) {
			ani[i].sleep();
		}
	}
}

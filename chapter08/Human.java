package chapter08;

public class Human {
	// 맴버 변수 (상속하기 위해 priotected)
		protected String color;
		// 멤버 메서드
		public void say(){
			System.out.println("저는 사람입니다.");
		}
		public void sayColor() {
			System.out.println("저의 피부색은 "+color+"입니다.");
		}
		//생성자
		Human(){};

}

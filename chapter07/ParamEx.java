package chapter07;

public class ParamEx {

	public static void main(String[] args) {
		
		Param p = new Param();
		// 클래스의 함수를 호출하려면 클래스를 생성하고
		// 클래스를 생성한 변수를 특별히 객체라고 한다.
		// [객체명].[클래스함수] 이렇게 호출한다.

		p.add(10,5);
//		p.add("10", "5"); //에러
		
		p.add2(10, 5);

	}

}

class Param {
	
	void add(int x, int y) { // 객체를 생성해야지 호출할 수 있는 함수
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
}
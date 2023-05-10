package chapter16;
// 정렬과 같은 작업을 하기 위해서는 비교대상의 선후관계를 정의해야 한다.
// 이 작업을 반드시 강제하기 위해서 Comparable이라는 인터페이스를 구현해야한다.
// 그러면 추후에 정렬 관련 메소드에서 비교를 어떻게 하는지 Comparable의 추상메소드
// compareTo 메소드를 참조하게 된다.
abstract class Shape implements Comparable<Shape>{
	
	// 필드
	int x, y;
	
	// 생성자
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상메서드
	abstract double area();
	abstract double length();
	
	// 일반 메서드
	public String getLocation() {
		return "x:" + x + ",y:" + y;
	}
	
	@Override
	public int compareTo(Shape s) {
        // 자신과 비교대상을 기준으로 같으면 0
        // 오름차순일 경우에 자신이 비교대상보다 작으면 음수 크면 양수로 반환
        // 내림차순일 경우에 자신이 비교대상보다 작으면 양수 크면 음수로 반환
        // 위 기준으로 사용자 정의 클래스 일 경우에 비교대상과 연산관련 로직을 정의한다.
		return (int)(this.area() - s.area() );
//		 따라서 기본 정렬을 내림차순으로 하고 싶다면 기본 오름차순 정렬 결과에 -1을 곱하면 된다.
//		return (int)( (this.area() - s.area()) * -1 );
	}
	
}

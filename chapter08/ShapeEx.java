package chapter08;

// 추상클래스는 1개 이상의 추상 메소드를 반드시 포함하고 있다.
abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
// 추상메소드: abstract 키워드가 메소드 선언 앞에 붙는 메소드, 정의부 X
// 추상메소드는 이를 상속하는 자식클래스에서 반드시 구현되도록 Java에서 지원하는 구조
	abstract double area();
	abstract double length();
}
class Circle extends Shape{
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	// 추상 클래스를 상속받은 자식 클래스에서는 부모 추상클래스의 추상 메소드를 반드시
	// 재정의(Override)해야한다.
	// @Override: 자바의 어노테이션 @[어노테이션] 해당 어노테이션의 기능을 내부적으로 수행한다.
	// @Override 어노테이션을 사용하면 자식클래스에서 추상클래스의 메소드를 Override 하지 않을경우
	// 에러를 발생한다. 만약에 사용하지 않을 경우에는 추상클래스의 메소드와 동일한 이름으로 작성해도
	// 새로운 메소드로 간주한다.
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", r=" + r + "]";
	}
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", width=" + width + ", height=" + height+"]";
	}

}

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이:"+s.area()+" 둘레:"+s.length());
		}
	}
}
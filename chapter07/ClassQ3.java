package chapter07;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    // radius필드에 대한 Setter 메소드 역할을 수행
    public void resize(double radius) {
        this.radius = radius;
    }
}

public class ClassQ3 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();
        System.out.println("반지름이 " + circle.getRadius() + "인 원의 넓이는 " + area + "이고,");
        System.out.println("둘레는 " + perimeter + "입니다.");
        circle.resize(3.0);
        area = circle.calculateArea();
        perimeter = circle.calculatePerimeter();
        System.out.println("반지름을 3으로 변경한 후,");
        System.out.println("원의 넓이는 " + area + "이고,");
        System.out.println("둘레는 " + perimeter + "입니다.");
    }
}

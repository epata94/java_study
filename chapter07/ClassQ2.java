package chapter07;

import java.util.Scanner;
// Rectangle.java
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}

// RectangleMain.java

public class ClassQ2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        System.out.println("가로 4, 세로 5인 직사각형");
        System.out.println("면적: " + rect1.getArea());
        System.out.println("둘레: " + rect1.getPerimeter());
        System.out.println("정사각형 여부: " + rect1.isSquare());

        System.out.println("\n사용자로 입력으로 부터 사각형 분석");
        Scanner sc = new Scanner(System.in);
        System.out.print("가로: ");
        double width = sc.nextDouble();
        System.out.print("세로: ");
        double height = sc.nextDouble();

        Rectangle rect2 = new Rectangle(width, height);
        System.out.println("가로 " + width + ", 세로 " + height + "인 직사각형");
        System.out.println("면적: " + rect2.getArea());
        System.out.println("둘레: " + rect2.getPerimeter());
        System.out.println("정사각형 여부: " + rect2.isSquare());
    }
}


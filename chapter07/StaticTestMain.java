package chapter07;

import chapter08.NoInheritCar3;

class StaticTest{
    public void printMyMessage(){
        System.out.println("오늘의 메뉴는 청국장입니다.");
    }
    public static void printGreeting(){
        System.out.println("안녕하세요.");
    }
}

public class StaticTestMain {
    public static void main(String[] args) {
        StaticTest p=new StaticTest();

        p.printMyMessage();
        StaticTest.printGreeting();

    }
}

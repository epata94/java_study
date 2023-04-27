package chapter09;

abstract class Robot{
    int batteryLevel;
    public abstract void activate();
    public abstract void deactivate();
}

interface Moveable{
    void moveForward();
    void moveBackward();
    void turnLeft();
    void turnRight();
}

interface AI{
    void detectObstruction();
    void talk();
}

interface Cleanable{
    void sweep();
    void mop();
}
// 설계사항: RCBot은 아이들을 위한 저가 제품으로 Robot 추상클래스와
// Moveable 인터페이스만 적용한다.
class RCBot extends Robot implements Moveable{
    @Override
    public void activate() {
        System.out.println("RCBot 전원을 킵니다.");
    }
    @Override
    public void deactivate() {
        System.out.println("RCBot 전원을 끕니다.");
    }

    @Override
    public void moveForward() {
        System.out.println("전진합니다.");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진합니다.");
    }

    @Override
    public void turnLeft() {
        System.out.println("좌회전합니다.");
    }

    @Override
    public void turnRight() {
        System.out.println("우회전합니다.");
    }

}
// 자사의 모든 기술을 동원하여 인공지능 청소 로봇, AICleanBot을 만든다.
// 핵심 기능과 모든 인터페이스를 활용한다.

class AICleanBot extends Robot implements Moveable, AI, Cleanable{
    @Override
//   구현 클래스에 따라 설계원칙을 지키며 자유롭게 구현하는 상황
    public void activate() {
        System.out.println("AIClen Bot 모델을 활성화 시킵니다.");
    }
    @Override
    public void deactivate() {
        System.out.println("AIClen Bot 모델을 종료합니다.");
    }

    @Override
    public void moveForward() {
        System.out.println("앞으로 이동합니다.");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진합니다.");
    }

    @Override
    public void turnLeft() {
        System.out.println("좌회전하여 직진합니다.");
    }

    @Override
    public void turnRight() {
        System.out.println("우회전하여 직진합니다.");
    }

    @Override
    public void detectObstruction() {
        System.out.println("장애물을 감지합니다.");
    }

    @Override
    public void talk() {
        System.out.println("대화모드로 전환합니다.");
    }

    @Override
    public void sweep() {
        System.out.println("바닥쓸기를 시작합니다.");
    }

    @Override
    public void mop() {
        System.out.println("바닥닦기를 시작합니다.");
    }
}

public class RobotMain {
    public static void main(String[] args) {
        RCBot rcBot = new RCBot();
        rcBot.activate();
        rcBot.moveForward();
        rcBot.moveBackward();
        rcBot.turnLeft();
        rcBot.turnRight();

    }
}

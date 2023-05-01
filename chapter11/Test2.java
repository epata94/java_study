package chapter11;


public class Test2 {
    public static void main(String[] args) {

        System.out.println("Test1.main 1");
        int result=0;
        try {
            // 특정 코드 <= try/catch로 잡을수 없는 상황: Error
            // 아래 코드는 try catch 로 예외처리가 되었기 때문에
            // 런타임 에러가 발생해도 프로그램이 종료되지 않는다.
            result = 1 / 0; // 에러가 발생하게 되면 멈추게 되는 상황
            // 실행해야 알수 있는 에러를 런타임 에러(오류)라고 한다.
            // 예외처리는 이러한 런타임 에러를 처리하는 메카니즘이다.
        }catch (Exception ex){
            System.out.println("Test2.main 예외발생: "+ex);
        }
        System.out.println(result);
        System.out.println("Test1.main 2");
//        System.out.println("Test1.main 3") 문법 오류는 수행하기 전에 알수 있다.
        System.out.println("Test1.main 프로그램 종료");
    }
}

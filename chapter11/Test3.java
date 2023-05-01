package chapter11;


public class Test3 {
    public static void main(String[] args) {

        System.out.println("Test1.main 1");
        int result=0;
        try {
            System.out.println("Test1.main 2");
            result = 1 / 0; // 에러가 발생하게 되면 멈추게 되는 상황
            System.out.println("Test1.main 3");
        }catch (Exception ex){
            System.out.println("Test2.main 예외발생: "+ex);
        }
        System.out.println("Test1.main "+result);
        System.out.println("Test1.main 프로그램 종료");
    }
}

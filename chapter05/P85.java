package chapter05;

public class P85 {
    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = true;
        int num1=10;
        int num2=20;
// 거짓인 경우
//        if(false){ // 리터럴(Literal,값)
//        if(condition1){ // 변수
//          if (num1==100){ // 조건식
//          if(true){// 리터럴 참인 경우
//          if(condition2){ // 변수
// if (조건식1 [논리연산자] 조건식2 [논리연산자] ... )
// 개별 조건식은 요구사항으로 해석할 수 있다.
          if((num1==10) && (num2==25) ){ // 두개 이상의 리터럴, 변수, 조건식
               System.out.println("참입니다.");
        }
    }
}

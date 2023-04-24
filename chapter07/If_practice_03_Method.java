package chapter07;

import java.util.Scanner;

/*
Q : 시간과 분을 따로 입력받고 추가로 분을 더 입력받아 입력받은 시간에서 추가로 입력한 분의
     더한 시간을 출력하도록 한다. 입력 시간은 24시간 형식을 입력받고 출력 시간은 오전/오후
     를 구분하는 12시간 형식을 출력하도록 한다.


   - 24시간 형식의 12시 30분은 12시간 형식의 오후 12시 30분 이다.
   - 24시간 형식의 00시 30분은 12시간 형식의 오전 12시 30분 이다.
   - 24시간 형식의 23시 30분은 12시간 형식의 오후 11시 30분 이다.
   - 24시간 형식의 11시 30분은 12시간 형식의 오전 11시 30분 이다.

   예 1.)
         시간 입력 : 23
         분 입력 : 50
         추가 분 입력 : 20
         입력 시간에서 20분을 추가한 시간은 오전 12시 10분입니다.

  ※ 0 ~ 23 시간의 입력 범위를 넘기면 지정한 범위의 값을 입력하도록 하는 메시지 출력
 */
public class If_practice_03_Method {

    public static void Time(int hour, int min, int addmin, String day) {

        int time = min + addmin;

        if (time >= 60) {
            int addhour = time / 60;
            time = time % 60;
            hour = hour + addhour;
        }
        if (hour == 12) {
            day = "오후";
        } else if (hour >= 13 && hour < 24) {
            hour = hour % 12;
            day = "오후";
        } else if (hour >= 0 && hour < 12) {
            day = "오전";
        } else if (hour == 24) {
            hour = 12;
            day = "오전";
        } else if (hour >= 25) {
            hour = hour % 24;

        }
        System.out.println("현재시간은 " + day + " " + hour + "시 " + time + " 분 입니다.");

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day= "오전";
        System.out.println("시간을 입력하세요 : ");
        int hour = scanner.nextInt();
        if(hour>=24){
            System.out.println("24시간 이하로 시간을 입력하세요.");
            System.exit(0);
        }

        System.out.println("분을 입력하세요 : ");
        int min = scanner.nextInt();
        if(min>=60){
            System.out.println("60분 이하로 분을 입력하세요.");
            System.exit(0);
        }

        System.out.println("추가 분을 입력하세요 : ");
        int addmin= scanner.nextInt();


    }
}

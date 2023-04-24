package chapter07;
import java.util.Scanner;

public class Prac3_2 {

    public static int[] cal() {

        Scanner sc = new Scanner(System.in);
        int cData[] = new int[2];

        int num;
        System.out.print("정수를 입력하세요: ");
        cData[0] = sc.nextInt();

        int mod = cData[0] % 2;
        cData[1] = (mod == 0) ? 0 : 1;

        return cData;
    }
    public static void main(String[] args) {
        int result[] = new int[2];
        result = cal();

        System.out.print(result[0] + "은(는) ");
        if(result[1]==0){
            System.out.print("짝수");
        }else {
            System.out.print("홀수");
        }
        System.out.println("입니다.");
    }
}

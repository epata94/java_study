package chapter07;

public class Programmers {
    public static int solution(int a, int b) {
        int answer = 0;
        if (a>b) answer = a;
        else answer =b;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2,91)); // 91
        System.out.println(solution(91, 100)); // 100
    }
}

package chapter06;

public class P116 {
    public static void main(String[] args) {
        int score1=100;
        int score2=95;
        int score3=80;
        // .....
        // scoreN

        int avg = (int)((score1+score2+score3)/3);
        System.out.println("평균점수는 "+avg+"입니다.");
// 배열: 같은 성격의 데이터를 하나의 변수명으로 묶어서 참조하고자 할떄
        int score[] = new int[3];
        score[0]=100;
        score[1]=95;
        score[2]=80;
        //....
        // score[N]
    }
}

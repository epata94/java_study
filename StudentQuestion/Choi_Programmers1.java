package StudentQuestion;

public class Choi_Programmers1 {
    public static int[] solution(int n) {

        int[] answer = new int[n];


        for(int i=0; i<answer.length; i++){
            if(i%2==1){
                answer[i]=i;
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(11) );
    }
}

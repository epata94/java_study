package chapter07;

public class ScoreManagement1 {
    public static void main(String[] args) {
        String[] student1 = {"홍길동","90","80","85"};
        String[] student2 = {"김철수","100","80","95"};
        String[] student3 = {"이영희","90","85","85"};

        String[][] students = {student1,student2,student3};

        for(String[] student: students){
            String name = student[0];
            //Integer.parseInt([문자열]): 문자열을 숫자로 변환
            int korScore = Integer.parseInt(student[1]);
            int engScore = Integer.parseInt(student[2]);
            int mathScore = Integer.parseInt(student[3]);

            double avgScore = (korScore+engScore+mathScore) / 3;

            System.out.println(name+"의 평균 점수는 "+avgScore+"입니다.");
        }
    }
}

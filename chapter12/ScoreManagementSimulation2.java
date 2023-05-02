package chapter12;


import java.util.Random;

class Person2 {
    private String name;
    private int korean;
    private int english;
    private int math;

    public Person2() {
        Random random = new Random();
        this.name = generateRandomKoreanName();
        this.korean = random.nextInt(100);
        this.english = random.nextInt(100);
        this.math = random.nextInt(100);
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
    public double getAverage(){
        return (korean+english+math)/3.0;
    }

    public static String generateRandomKoreanName(){
        Random random = new Random();
        String[] familyNames = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "남궁", "진"};
        String[] givenNames1 = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파", "하"};
        String[] givenNames2 = {"은", "진", "미", "현", "주", "성", "영", "지", "종", "광", "준", "희", "수", "성", "민", "선", "민", "재", "훈", "우", "승", "기", "혁", "석", "태", "준", "성", "진", "규", "동", "택", "기", "헌"};
        // random.nextInt(familyNames.length) : 성의 값을 랜덤하게 선택할 수 있는 인덱스 생성
        String familyName = familyNames[random.nextInt(familyNames.length)];
        // 같은 방식으로 이름의 가운데 글자 랜덤하게 생성
        String givenName1 = givenNames1[random.nextInt(givenNames1.length)];
        // 같은 방식으로 이름의 마지막 글자 랜덤하게 생성
        String givenName2 = givenNames2[random.nextInt(givenNames2.length)];

        return familyName+givenName1+givenName2;
    }

    @Override
    public String toString() {
        return String.format("%s\t %d\t %d\t %d\t %.1f", name, korean, english, math, getAverage());
    }
}

public class ScoreManagementSimulation2 {
    public static void main(String[] args) {
        int numStudents=60;
        Person2[] students = new Person2[numStudents];

        System.out.printf("%s\t\t%s\t%s\t%s\t%s\n", "학생", "국어", "영어", "수학", "평균점수");
        for(int i=0; i<numStudents;i++){
            students[i] = new Person2();
            System.out.println(students[i].toString());
        }


        // 학급의 평균 점수 계산
        double classAverage=0;
        for(Person2 student: students){
            // 전체 평균 점수 누적
            classAverage = classAverage+student.getAverage();
        }



        // 현재 학급의 평균점수
        classAverage =  classAverage / numStudents;
// 소수점 1자리로 표시되도록 반올림(P327 코드 참조)
        System.out.println("\n학급의 평균 점수: "+Math.round(classAverage*10)/10.0);

        // 최고 평균 점수를 가진 학생 찾기
        Person2 topStudent = students[0];
        for(int i=1; i<numStudents; i++){
            if(students[i].getAverage() > topStudent.getAverage()){
                topStudent = students[i];
            }
        }
        System.out.println("최고 평균 점수를 가진 학생 정보: "+topStudent.toString());

        // 최저 평균 점수를 가진 학생 찾기
        Person2 bottomStudent = students[0];
        for(int i=1; i<numStudents; i++){
            if(students[i].getAverage() < bottomStudent.getAverage()){
                bottomStudent = students[i];
            }
        }
        System.out.println("\n최저 평균 점수를 가진 학생 정보: "+bottomStudent.toString());

        System.out.println("프로그램 종료");
    }
}

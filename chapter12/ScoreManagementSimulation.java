package chapter12;

import java.util.Random;

class Person{
    private String name;
    private int korean;
    private int english;
    private int math;

    public Person() {
        Random random = new Random();
        this.name = generateRandomKoreanName();
        this.korean = random.nextInt(101);
        this.english = random.nextInt(101);
        this.math = random.nextInt(101);
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
}

public class ScoreManagementSimulation {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        System.out.println(p1.getName());
        System.out.println(p1.getKorean());
        System.out.println(p1.getEnglish());
        System.out.println(p1.getMath());
    }
}

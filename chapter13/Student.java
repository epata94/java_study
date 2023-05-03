package chapter13;

public class Student {
    private static int nextId = 1;
    private int id;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.id = nextId++;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public double getAverage() {
        return (koreanScore + englishScore + mathScore) / 3.0;
    }

    public String toString() {
        return name + "\t" + id + "\t" + koreanScore + "\t" + englishScore + "\t" + mathScore + "\t" + String.format("%.2f", getAverage());
    }
}

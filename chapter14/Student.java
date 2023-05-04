package chapter14;
import java.text.DecimalFormat;

public class Student {
    private String id;
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(String id, String name, int koreanScore, int englishScore, int mathScore) {

        this.id = id;
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getId() {
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

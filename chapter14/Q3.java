package chapter14;
import java.util.HashMap;
import java.util.Map;
public class Q3 {
    public static void main(String[] args) {
        // String 타입의 key와 Integer 타입의 value를 가지는 HashMap 생성
        HashMap<String, Integer> scores = new HashMap<>();

        // 학생들의 이름과 점수를 HashMap에 추가
        scores.put("홍길동", 90);
        scores.put("이순신", 80);
        scores.put("강감찬", 70);

        // 학생 이름을 입력받아 해당 학생의 점수를 출력
        String name = "이순신";
        int score = scores.get(name);
        System.out.println(name + "의 점수는 " + score + "점입니다.");
    }
}
class Employee2 {
    private int id;
    private String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
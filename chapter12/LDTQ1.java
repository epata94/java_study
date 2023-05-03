package chapter12;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LDTQ1 {
    public static void main(String[] args) {
        // 현재 LocalDateTime 객체 생성
        LocalDateTime now = LocalDateTime.now();

        // DateTimeFormatter를 사용하여 LocalDateTime 객체를 원하는 형식으로 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println(formattedDateTime);
    }
}

package chapter12;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LDTQ2 {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 출력
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // 3시간 30분 후의 시간을 출력
        LocalDateTime afterDateTime = currentDateTime.plusHours(3).plusMinutes(30);
        System.out.println("3시간 30분 후의 시간: " + afterDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}

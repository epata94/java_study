package chapter12;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class LocalDateTimeFormatTest {
    public static void main(String[] args) {

        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();

        // DateTimeFormatter 생성
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 EEEE h:mm a", Locale.KOREA);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 EEEE h:mm a", Locale.KOREA);

        // 포맷 적용하여 문자열로 변환
        String formattedDateTime = now.format(formatter);

        System.out.println(formattedDateTime);
    }
}

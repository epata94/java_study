package chapter12;
import java.time.LocalDateTime;
public class LocalDateTimeTest {
    public static void main(String[] args) {

        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + now);
/**
 * 출력예시: 2023-05-02T15:38:02.984610 <= ISO-8601 표준 포멧으로 출력
 */

        // 날짜와 시간 구성 요소 가져오기
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.printf("현재 날짜와 시간은 %d년 %d월 %d일 %d시 %d분 %d초입니다.%n", year, month, day, hour, minute, second);

        // 날짜와 시간 계산
        LocalDateTime nextMonth = now.plusMonths(1);
        System.out.println("다음 달: " + nextMonth);

        LocalDateTime nextYear = now.plusYears(1);
        System.out.println("내년: " + nextYear);

        LocalDateTime tenDaysAgo = now.minusDays(10);
        System.out.println("10일 전: " + tenDaysAgo);

        // 날짜와 시간 비교
        LocalDateTime anotherDateTime = LocalDateTime.of(2023, 6, 15, 10, 0);
        if (now.isBefore(anotherDateTime)) {
            System.out.println("현재 날짜와 시간은 " + anotherDateTime + " 이전입니다.");
        } else if (now.isAfter(anotherDateTime)) {
            System.out.println("현재 날짜와 시간은 " + anotherDateTime + " 이후입니다.");
        } else {
            System.out.println("현재 날짜와 시간은 " + anotherDateTime + " 입니다.");
        }
    }
}

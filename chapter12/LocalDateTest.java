package chapter12;
import java.time.LocalDate;
// 최근 날짜, 시간관련 처리는 Date, Calendar, 그레고리안칼랜더 보다 LocalDate, LocalTime, LocalDateTime을 주로사용한다.
// LocalDate: 날짜 처리,
// LocalTime: 시간 처리
// LocalDateTime: 날짜시간 동시에 처리
public class LocalDateTest {
    public static void main(String[] args) {

        // 현재 날짜 가져오기
        LocalDate today = LocalDate.now();
        System.out.println("현재 날짜: " + today);

        // 날짜 구성 요소 가져오기
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("오늘은 %d년 %d월 %d일입니다.%n", year, month, day);

        // 날짜 계산
        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("다음 달: " + nextMonth);

        LocalDate nextYear = today.plusYears(1);
        System.out.println("내년: " + nextYear);

        LocalDate tenDaysAgo = today.minusDays(10);
        System.out.println("10일 전: " + tenDaysAgo);

        // 날짜 비교
        LocalDate anotherDate = LocalDate.of(2023, 6, 15);
        if (today.isBefore(anotherDate)) {
            System.out.println("오늘은 " + anotherDate + " 이전입니다.");
        } else if (today.isAfter(anotherDate)) {
            System.out.println("오늘은 " + anotherDate + " 이후입니다.");
        } else {
            System.out.println("오늘은 " + anotherDate + " 입니다.");
        }
    }
}

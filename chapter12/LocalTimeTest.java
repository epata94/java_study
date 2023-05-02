package chapter12;
import java.time.LocalTime;
public class LocalTimeTest {
    public static void main(String[] args) {

        // 현재 시간 가져오기
        LocalTime now = LocalTime.now();
        System.out.println("현재 시간: " + now);

        // 시간 구성 요소 가져오기
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.printf("현재 시각은 %d시 %d분 %d초입니다.%n", hour, minute, second);

        // 시간 계산
        LocalTime nextHour = now.plusHours(1);
        System.out.println("1시간 뒤: " + nextHour);

        LocalTime inTwoHours = now.plusHours(2);
        System.out.println("2시간 뒤: " + inTwoHours);

        LocalTime inTenMinutes = now.plusMinutes(10);
        System.out.println("10분 뒤: " + inTenMinutes);

        // 시간 비교
        LocalTime anotherTime = LocalTime.of(20, 30, 0);
        if (now.isBefore(anotherTime)) {
            System.out.println("현재 시간은 " + anotherTime + " 이전입니다.");
        } else if (now.isAfter(anotherTime)) {
            System.out.println("현재 시간은 " + anotherTime + " 이후입니다.");
        } else {
            System.out.println("현재 시간은 " + anotherTime + " 입니다.");
        }
    }
}

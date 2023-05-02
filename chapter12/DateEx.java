package chapter12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
//	Java1버전때 나온 클래스이며 지금은 사용하지 않는다.
// 하위 호환을 위해서만 사용한다.
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sf.format(now));
		System.out.println(sf2.format(now));

		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());

	}

}

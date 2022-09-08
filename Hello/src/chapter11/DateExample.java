package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시mm분ss초");
		//SimpleDateFormat : 날짜를 원하는 포맷에 맞게 문자열로 변환
		System.out.println(format.format(date));
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년" + month + "월" + day + "일");
		
		System.out.println(LocalDateTime.now()); //현재 지역 시간을 가져옴, 포맷도 지역에 맞게 출력됨(date는 미국기준)
		
		// chaining 방식
		String date2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시mm분ss초"));
		System.out.println(date2);
	}
}

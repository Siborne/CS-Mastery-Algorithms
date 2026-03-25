package Day38;


import java.time.LocalTime;


public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime start = LocalTime.of(6,13,22);
		LocalTime end = LocalTime.of(14, 36, 21);
		int ans = 0 ;
		while(start.isBefore(end)) {
			int minute = start.getMinute();
			int second = start.getSecond();
			int hour = start.getHour();
			if(minute==second) {
				ans++;
			}
			if(hour==second&&hour==minute) {
				ans--;
			}
			start = start.plusSeconds(1);
		}
		System.out.println(ans);
	}

}

package Day38;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		solve();
	}
	private static Scanner reader;
	private static void solve() throws ParseException {
		reader = new Scanner(System.in);
		int T = reader.nextInt();
		reader.nextLine();
		while(T-->0) {
			long time1 = getTime();
			long time2 = getTime();
			long t = (time1+time2)/2;
			System.out.printf("%02d:%02d:%02d\n",t/3600,t/60%60,t%60);
		}
		reader.close();
	}
	
	private static long getTime() throws ParseException{
		String line =  reader.nextLine();
		String[] split = line.split("\\s+");
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date t1 = format.parse(split[0]);
		Date t2 = format.parse(split[1]);
		
		int d = 0;
		if(split.length == 3) {
			d = Integer.parseInt(split[2].substring(2,3));
		}
		
		return d*24*3600+t2.getTime()/1000-t1.getTime()/1000;
	}

}

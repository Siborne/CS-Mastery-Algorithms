package Day36;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		long ms = reader.nextLong();
		Date date = new Date(ms);
		SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
		System.out.println(ft.format(ms));
		reader.close();
	}

}

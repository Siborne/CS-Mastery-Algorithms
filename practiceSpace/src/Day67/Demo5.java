package Day67;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		 int t = reader.nextInt();
	        while (t-- > 0) {
	            int h = reader.nextInt();
	            int m = reader.nextInt();

	            // 如果已经是 24:00，则剩余 0 分钟
	            if (h == 24 && m == 0) {
	                System.out.println(0);
	                continue;
	            }

	            // 计算到 24:00 的剩余分钟数
	            int remainingMinutes = (23 - h) * 60 + (60 - m);
	            System.out.println(remainingMinutes);
	        }
		
		
		reader.close();
	}

}

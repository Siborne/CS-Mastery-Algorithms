package Day20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	        
	        // 读取输入的字符串形式的数字
	        String input = reader.nextLine();
	        char[] chs = input.toCharArray();
	        
	        // 创建一个长度为 10 的数组，用于统计每个数字的出现次数
	        int[] count = new int[10];
	        
	        // 遍历字符数组，统计每个数字的出现次数
	        for (char ch : chs) {
	            int num = ch - '0'; // 将字符转换为数字
	            count[num]++;
	        }
	        
	        // 按升序输出结果
	        for (int i = 0; i < 10; i++) {
	            if (count[i] > 0) { // 只输出出现过的数字
	                System.out.println(i + ":" + count[i]);
	            }
	        }
	        
	        reader.close();
	}
	
}

package Day40;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Demo8 {

	private static String start;
	private static String target;
	private static Map<String, Integer> map = new HashMap<>();
	private static int[] dir = { -3, -2, -1, 1, 2, 3 };
	private static int step;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		start = reader.nextLine();
		target = reader.nextLine();
		bfs();
		reader.close();
	}

	private static void bfs() {
		Queue<String> queue = new LinkedList<>();
		queue.add(start);

		while (queue.size() != 0) {
			int size = queue.size();
			step++;

			while (size-- != 0) {
				String s = queue.poll();
				
				if(s.equals(target)) {
					System.out.println(map.get(s));
					return;
				}
				
				for(int i = 0;i<s.length();i++) {
					if(s.charAt(i)!='*') {
						char c = s.charAt(i);
						for(int j = 0;j<dir.length;j++) {
							int d = dir[j] + i;
							if(d>=0&&d<s.length()&&s.charAt(d)=='*') {
								StringBuilder sb = new StringBuilder(s);
								sb.setCharAt(i, '*');
								sb.setCharAt(d, c);
								String sbStr = sb.toString();
								if(!map.containsKey(sbStr)) {
									map.put(sbStr, step);
									queue.add(sbStr);
								}
							}
						}
					}
				}
				
			}
		}

	}

}

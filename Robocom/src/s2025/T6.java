package s2025;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] timu = new int[m + 1];
		Arrays.fill(timu, -1);
		reader.nextLine();
		for (int i = 0; i < n; i++) {
			String line = reader.nextLine();
			String[] strs = line.split(" ");
			String date = strs[0] + " " + strs[1];
			int t = Integer.parseInt(strs[2]);
			int num = Integer.parseInt(strs[3]);
//			System.out.println(date);
//			System.out.println(t);
//			System.out.println(num);
			if (timu[t] < num) {
				timu[t] = num;
				map.put(t, date);
			}
		}
		
		List<Node> list = new ArrayList<>();
		for (int t : map.keySet()) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(map.get(t)).append(" ").append(t).append(" ").append(timu[t]);
//			System.out.println(sb);
			list.add(new Node(map.get(t),t,timu[t]));
		}

		Collections.sort(list,(n1,n2)->{
			return Integer.compare(n1.daxiao, n2.daxiao);
		});
		
		for(Node node :list) {
			System.out.println(node.date+" "+node.th+" "+node.fs);
		}
		
		reader.close();
	}

	public static class Node{
		private String date;
		private int daxiao;
		private int th;
		private int fs;

		private Node(String date,int th,int fs) {
			this.date =date;
			this.th =th;
			this.fs =fs;
			String[] strs = date.split(" ");
			String time = strs[1];
			String[] jt = time.split(":");
			this.daxiao = Integer.parseInt(jt[0])*60*60 + Integer.parseInt(jt[1])*60+Integer.parseInt(jt[2]);
		}
		
	}

}

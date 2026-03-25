package s2025;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		int max = 0;
		List<Node> list = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			int x = reader.nextInt();
			max += x;
			list.add(new Node(i,x));
		}
		
		if(max<m) {
			System.out.println(0);
			System.out.println("Suan4 le ba, hai2 cha4 "+(m-max)+".");
			return;
		}
		
		Collections.sort(list,(o1,o2)->{
			return Integer.compare(o2.lq, o1.lq);
		});
		
		List<Integer> bh = new ArrayList<>();
		max = 0;
		int i = 0;
		while(max<m) {
			max+=list.get(i).lq;
			bh.add(list.get(i).bh);
			i++;
		}
		StringBuilder sb = new StringBuilder();
		for(int j = bh.size()-1;j>=0;j--) {
			sb.append(bh.get(j)).append(" ");
		}
		String res = sb.substring(0, sb.length()-1);
		System.out.println(bh.size());
		System.out.println(res);
		reader.close();
	}
	
	private static class Node{
		int bh;
		int lq;
		private Node(int bh,int lq){
			this.bh = bh;
			this.lq = lq;
		}
	}
	
}

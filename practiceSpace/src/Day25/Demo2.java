package Day25;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Demo2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			long m = Long.parseLong(st.nextToken());
			Node[] nodes = new Node[n];
			for(int i = 0;i<n;i++) {
				st = new StringTokenizer(reader.readLine());
				Node node = new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
				nodes[i] = node;
			}
			Arrays.sort(nodes);
			boolean flag = true;
			for(int i = 0;i<n;i++) {
				if(nodes[i].a>m) {
					flag = false;
					break;
				}
				m = m-nodes[i].a+nodes[i].b;
			}
			writer.println(flag?"Yes":"No");
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
	
	private static class Node implements Comparable{
		int a;
		int b;
		public Node() {};
		public Node(int a,int b) {
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(Object b) {
			int bb = ((Node)b).b;
			int ab = ((Node)b).a;
			if(this.b>this.a&&bb>ab) {
				return this.a-ab;
			}else if(this.b<this.a&&bb<ab) {
				return bb-this.b;
			}
			return (bb-ab)-(this.b-this.a);
		}
	}
	
	
}

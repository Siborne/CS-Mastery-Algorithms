package Day8;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo3 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		UnionFind uf = new UnionFind(n);
		while(m-->0) {
			st = new StringTokenizer(reader.readLine());
			String op = st.nextToken();
			if(op.equals("C")) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				uf.union(a,b);
			}else if(op.equals("Q1")) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(uf.find(a) == uf.find(b)) {
					writer.println("Yes");
				}else {
					writer.println("No");
				}
			}else {
				int a = Integer.parseInt(st.nextToken());
				writer.println(uf.getSize(a));
			}
		
			
		}
		writer.flush();
		writer.close();
		reader.close();
	}
	
	public static class UnionFind{
		int[] parent;
		int[] size;
		
		public UnionFind(int n) {
			parent = new int[n+1];
			size = new int[n+1];
			for(int i = 1;i<=n;i++) {
				parent[i] = i;
				size[i] = 1;
			}
		}
		
		public int find(int x) {
			if(parent[x] != x) {
				parent[x] = find(parent[x]);
			}
			return parent[x];
		}
		
		public void union(int x,int y) {
			int rootX = find(x);
			int rootY = find(y);
			if(rootX == rootY) {
				return;
			}
			if(size[rootX]<size[rootY]) {
				int temp = rootX;
				rootX = rootY;
				rootY = temp;
			}
			parent[rootY] = rootX;
			size[rootX] += size[rootY];
		}
		
		public int getSize(int x) {
			int root = find(x);
			return size[root];
		}
	}

}

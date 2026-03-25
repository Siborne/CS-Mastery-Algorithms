package Day48;

import java.util.Scanner;

public class Demo7 {
	private static int[] arr;
	private static int ans;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		ans = n;
		arr = new int[n+1];
		for(int i = 1;i<arr.length;i++) {
			arr[i] = i;
		}
		while(m-->0) {
			int u = reader.nextInt();
			int v = reader.nextInt();
			union(u, v);
		}
		System.out.println(ans);
		reader.close();
	}
	
	private static int find(int x) {
		// TODO Auto-generated method stub
		if(x!=arr[x]) {
			arr[x] = find(arr[x]);
		}
		return arr[x];
	}
	
	private static void union(int x, int y) {
		if(find(x)!=find(y)) {
			ans--;
		}
		arr[find(y)] = find(x);
	}

}

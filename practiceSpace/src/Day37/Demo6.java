package Day37;

public class Demo6 {

	public static void main(String[] args) {
		solve();
	}
	private static boolean[] visited = new boolean[13];
	private static int ans = 0;
	private static int[] arr = new int[12];
	
	private static void solve() {
		dfs(0);
		System.out.println(ans);
//		System.out.println(1);
	}
	
	private static void dfs(int index) {
		if(index == arr.length) {
			if(arr[0]+arr[1]!=arr[2]) {
				return;
			}
			if(arr[3]-arr[4]!=arr[5]) {
				return;
			}
			if(arr[6]*arr[7]!=arr[8]) {
				return;
			}
			if(arr[10]*arr[11]!=arr[9]) {
				return;
			}
			ans++;
			return;
		}
		
		for(int i = 0;i<13;i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = i+1;
				dfs(index+1);
				visited[i] = false;
			}
		}
		
	}
}

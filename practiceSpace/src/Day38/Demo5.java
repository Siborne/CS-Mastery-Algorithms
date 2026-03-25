package Day38;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static int[] arr = {1,2,3,4,5,6,8,9,10,12};
	private static int ans;
	private static void solve() {
		dfs(0);
		System.out.println(ans/10);
	}
	
	private static void dfs(int step) {
		if(step == arr.length) {
			int d1 = arr[0]+arr[2]+arr[5]+arr[8];
			int d2 = arr[0]+arr[3]+arr[6]+arr[9];
			int d3 = arr[1]+arr[5]+arr[7]+arr[9];
			int d4 = arr[1]+arr[2]+arr[3]+arr[4];
			int d5 = arr[4]+arr[6]+arr[7]+arr[8];
			if(d1==d2&&d2==d3&&d3==d4&&d4==d5) {
				ans++;
			}
			return;
		}
		
		for(int i = step;i<arr.length;i++) {
			swap(step,i);
			dfs(step+1);
			swap(step, i);
		}
		
		
	}
	
	private static void swap(int x,int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	

}

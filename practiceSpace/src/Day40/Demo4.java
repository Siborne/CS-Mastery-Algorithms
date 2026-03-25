package Day40;

public class Demo4 {

	private static int[] arr = new int[17];
	private static boolean[] visited = new boolean[17];
	private static int sum = 1;
	private static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr[0] = 1;
		dfs(1);
		System.out.println(ans);
	}

	private static void dfs(int index) {
		if (index % 4 == 0) {
			if (sum % 34 != 0) {
				return;
			}
		}

		if (index == 13) {
			if (arr[0] + arr[4] + arr[8] + arr[12] != 34) {
				return;
			}
			if (arr[3] + arr[6] + arr[9] + arr[12] != 34) {
				return;
			}
		} else if (index == 14) {
			if (arr[1] + arr[5] + arr[9] + arr[13] != 34) {
				return;
			}
		} else if (index == 15) {
			if(arr[2]+arr[6]+arr[10]+arr[14]!=34) {
				return;
			}
		} else if (index == 16) {
			if(arr[3]+arr[7]+arr[11]+arr[15]!=34) {
				return;
			}
			if(arr[0]+arr[5]+arr[10]+arr[15]!=34) {
				return;
			}
			ans++;
		}
		
		for(int i = 2;i<=16;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[index] = i;
				sum+=i;
				dfs(index+1);
				sum-=i;
				visited[i]=false;
			}
		}
		
	}

}

package Day38;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		String input = "tocyjkdzcieoiodfpbgcncsrjbhmugdnojjddhllnofawllbhfiadgdcdjstemphmnjihecoapdjjrprrqnhgccevdarufmliqijgihhfgdcmxvicfauachlifhafpdccfseflcdgjncadfclvfmadvrnaaahahndsikzssoywakgnfjjaihtniptwoulxbaeqkqhfwl";
		char[] chs = input.toCharArray();
		int[] dp = new int[input.length()];
		Arrays.fill(dp, 1);
		for(int i = 1;i<dp.length;i++) {
			for(int j = 0;j<i;j++) {
				if(chs[i]>chs[j]) {
					dp[i] = dp[i]+dp[j];
				}
				if(chs[i] == chs[j]) {
					dp[i] = dp[i]-dp[j];
				}
			}
		}
		int sum = 0;
		for(int n:dp) {
			sum+=n;
		}
		System.out.println(sum);
	}

}

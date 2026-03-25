package Day39;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] st = new int[101];
		for (int i = 1; i <= 100; i++) {
			int k = i;
			for (int j = 2; j * j <= k; j++) {
				if (k % j == 0) {
					while (k % j == 0) {
						k /= j;
						st[j]++;
					}
				}
			}
			if(k>1) {
				st[k]++;
			}
		}
		long ans = 1;
		for(int i = 0;i<st.length;i++) {
			if(st[i]!=0) {
				ans*=(st[i]+1);
			}
		}
		System.out.println(ans);
	}

}

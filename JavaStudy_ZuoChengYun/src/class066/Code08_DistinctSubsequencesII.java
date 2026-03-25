package class066;

public class Code08_DistinctSubsequencesII {

	private static final int MOD = (int) 1e9 + 7;

	public int distinctSubseqII(String s) {
		char[] str = s.toCharArray();
		int[] cnt = new int[26];
		int all = 1, newAdd;
		for (char x : str) {
			newAdd = (all - cnt[x - 'a'] + MOD) % MOD;
			cnt[x - 'a'] = (cnt[x - 'a'] + newAdd) % MOD;
			all = (all + newAdd) % MOD;
		}
		return (all - 1 + MOD) % MOD;
	}

}

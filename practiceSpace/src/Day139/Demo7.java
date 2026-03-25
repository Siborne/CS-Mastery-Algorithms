package Day139;

public class Demo7 {
	public static int lengthOfLastWord(String s) {
		int n = s.length();
		int ans = 0;
		int i = n - 1;
		while (s.charAt(i) == ' ') {
			i--;
		}
		for (; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			} else {
				ans++;
			}
		}
		return ans;
	}

}

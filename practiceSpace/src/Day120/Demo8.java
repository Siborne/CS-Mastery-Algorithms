package Day120;

public class Demo8 {

	public String reverseStr(String s, int k) {
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i += 2 * k) {
			int start = i;
			int end = Math.min(chs.length - 1, start + k - 1);
			while (start < end) {
				chs[start] ^= chs[end];
				chs[end] ^= chs[start];
				chs[start++] ^= chs[end--];
			}
		}
		return String.valueOf(chs);
	}

}

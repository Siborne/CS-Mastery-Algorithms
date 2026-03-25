package Day120;

public class Demo7 {

	public void reverseString(char[] s) {
		int l = 0, r = s.length - 1;
		while (l < r) {
			s[l] ^= s[r];
			s[r] ^= s[l];
			s[l++] ^= s[r--];
		}
	}

}

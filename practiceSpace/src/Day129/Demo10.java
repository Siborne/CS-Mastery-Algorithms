package Day129;

import java.util.Arrays;

public class Demo10 {

	public static void main(String[] args) {
		char[] chs = "WHERETHEREISAWILLTHEREISAWAY".toCharArray();
		Arrays.sort(chs);
		System.out.println(new String(chs));
	}
	
}

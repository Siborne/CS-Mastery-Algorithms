package Day138;

public class Demo1 {

	public String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		int len1 = word1.length();
		int len2 = word2.length();
		int i;
		for (i = 0; i < len1 && i < len2; i++) {
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		}
		if (i!=len1) {
			sb.append(word1.substring(i));
		}
		if (i!=len2) {
			sb.append(word2.substring(i));
		}

		return sb.toString();
	}

}

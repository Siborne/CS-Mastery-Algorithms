package Day138;

public class Demo2 {

	public char findTheDifference(String s, String t) {
		int num = 0;
		for (char c : s.toCharArray()) {
			num ^= c;
		}
		for (char c : t.toCharArray()) {
			num ^= c;
		}
		return (char) num;
	}

}

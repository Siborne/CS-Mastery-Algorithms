package Day138;

public class Demo4 {
	public boolean repeatedSubstringPattern(String s) {
		return (s + s).indexOf(s, 1) != s.length();
	}
}

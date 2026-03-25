package Day42;

public class Demo12 {

	private static final String A = "aejcldbhpiogfqnkr";
	private static final String B = "ncfjboqiealhkrpgd";

	public static void main(String[] args) {
		long t = tak(B) - tak(A);
		t = Math.abs(t);
		t = Math.min(t, check(17) - t);
		System.out.println(t);
	}

	private static long check(int n) {
		if (n == 0) {
			return 0;
		}
		long t = 1;
		for (int i = 1; i <= n; i++) {
			t *= i;
		}
		return t;
	}

	private static long tak(String str) {
		long ans = 0;
		
		for(int i= 0;i<str.length();i++) {
			int t = 0;
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(j)<str.charAt(i)) {
					t++;
				}
			}
			ans += check(str.length()-1-i)*t;
		}
		
		return ans;
	}

}

package Day41;

public class Demo12 {

	public static void main(String[] args) {
		int ans = 0;
		for(int i = 1;i<=Math.pow(10, 4);i++) {
			long lifang = (long)Math.pow(i, 3);
			String str  = String.valueOf(lifang);
			str = str.substring(str.length()-String.valueOf(i).length());
			int last = Integer.parseInt(str);
			if(i==last) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
}

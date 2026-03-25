package Day33;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd(2019,324);
		System.out.println(ans);
	}

	private static long ans;
	
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		ans+=a/b;
		return gcd(b,a%b);
	}
	
}

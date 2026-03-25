package Day33;

public class Demo2 {

	public static void main(String[] args) {
		long i = 2019;
		while(true) {
			i+=2019;
			if(test(i)) {
				System.out.println(i);
				return;
			}
		}
	}
	
	private static boolean test(long n) {
		while(n>0) {
			long temp = n%10;
			if(temp%2==0) {
				return false;
			}
			n/=10;
		}
		return true;
	}

}

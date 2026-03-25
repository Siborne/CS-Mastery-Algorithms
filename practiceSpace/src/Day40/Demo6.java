package Day40;

public class Demo6 {

	public static void main(String[] args) {
		int ans = 0;

		for (int i = 1; i <= 20210605; i++) {
			int j = i;
			boolean flag = true;
			while (j != 0) {
				flag = isPrime(j % 10);
				if (!flag) {
					break;
				}
				j /= 10;
			}
			if (flag&&isPrime(i)) {
				ans++;
			}
//			while(j!=0) {
//				if(!isPrime(j%10)) {
//					break;
//				}
//				j/=10;
//			}
//			if(j==0&&isPrime(i)) {
//				ans++;
//			}
		}

		System.out.println(ans);
	}

	private static boolean isPrime(int n) {
		if(n==1||n==0) {
			return false;
		}
//		if(n==2) {
//			return true;
//		}
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}

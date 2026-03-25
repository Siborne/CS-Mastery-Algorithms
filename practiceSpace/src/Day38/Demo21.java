package Day38;

public class Demo21 {

	private static final long MOD = (long)1e9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = 0L;
		long temp =1L;
		int i = 1;
		while(true) {
			temp*=i;
			temp%=MOD;
			ans+=temp;
			ans%=MOD;
			if(temp%MOD==0) {
				System.out.println(ans);
				break;
			}
			i++;
		}
	}

}

package Day29;

public class Demo1 {
	private static final int MOD =6421;
	public static void main(String[] args) {
		long ans = 0;
		int[] yu = new int[6421];
		int t = 0;
		for(int i = 1;i<=20240601;i++) {
			int modNum = mod(i,i);
			if(modNum==0) {
				t++;
			}else {
				yu[modNum]++;
			}
		}
		
		ans+=t*(t-1)/2;
		for(int i = 1;i<=3210;i++) {
			ans+=yu[i]*yu[6421-i];
		}
		
		System.out.println(ans);
		
	}
	
	private static int mod(long x,long y) {
		long res = 1;
		while(y>0) {
			if(y%2==1) {
				res=res*x%MOD;
			}
			x=x*x%MOD;
			y/=2;
		}
		return (int)res;
	}

}

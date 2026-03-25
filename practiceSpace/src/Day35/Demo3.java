package Day35;

public class Demo3 {

	public static void main(String[] args) {
		int[] mo = new int[12];
		for(int i = 12;i<50000;i+=12) {
			for(int j = 0;j<mo.length;j++) {
				mo[j] = i/12;
			}
			dfs(mo,0,i);
		}
		
	}
	
	private static void dfs(int[] mo,int i, int i2) {
		int sum = 0;
		if(i==12) {
			for(int j = 0;j<mo.length;j++) {
				System.out.print(mo[j] +" ");
			}
			return;
		}
		
		for(int j = 0;j<mo.length;j++) {
			if(i!=j) {
				if(mo[j]%2!=0) {
					return;
				}
				sum+=mo[j]/2;
				mo[j]/=2;
			}
		}
		mo[i]+=sum;
		dfs(mo,i+1,i2);
	}

}

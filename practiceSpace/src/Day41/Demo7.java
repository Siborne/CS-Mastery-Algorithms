package Day41;

public class Demo7 {
	
	private static final int[][] arr = new int[][] {{0,0},{2020,11},{11,14},{2000,2000}}; 
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i = -2020;i<=4040;i++) {
			for(int j = -2020;j<=4040;j++) {
				if(isValid(i, j)) {
					ans++;
				}
			}
		}
		
		
		System.out.println(ans);
	}
	
	private static  boolean isValid(int x,int y) {
		for(int[] a:arr) {
			if(Math.abs(a[0]-x)+Math.abs(a[1]-y)<=2020) {
				return true;
			}
		}
		return false;
	}

}

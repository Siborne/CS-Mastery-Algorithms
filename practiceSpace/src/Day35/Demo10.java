package Day35;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.5f",function(1));
	}
	
	private static double function(int n) {
		if(n>=20) {
			return n/(n+n+1);
		}
		return n/(n+function(n+1));
	}

}

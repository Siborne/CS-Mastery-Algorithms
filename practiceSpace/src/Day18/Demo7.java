package Day18;

public class Demo7 {

	public static void main(String[] args) {
		int num = 2024;
		int ans = 0;
		while(num!=0) {
			if(num%2==1) {
				ans++;
			}
			num/=2;
		}
		System.out.println(ans);
	}

}

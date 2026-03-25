package Day75;

import java.util.Scanner;

public class Demo34 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a[] = new int[9];
		for(int i = 0;i<a.length;i++) {
			a[i] = reader.nextInt();
		}
		double ab = Math.sqrt(Math.pow(a[0]-a[3],2)+Math.pow(a[1]-a[4],2)+Math.pow(a[2]-a[5], 2));
		double ac = Math.sqrt(Math.pow(a[0]-a[6],2)+Math.pow(a[1]-a[7],2)+Math.pow(a[2]-a[8], 2));
		double bc = Math.sqrt(Math.pow(a[6]-a[3],2)+Math.pow(a[7]-a[4],2)+Math.pow(a[8]-a[5], 2));
		double p = (ab+ac+bc)/2;
		double ans = Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
		System.out.printf("%.2f",ans);
		reader.close();
	}
	
}

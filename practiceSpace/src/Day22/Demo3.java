package Day22;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	static class Farmer {
		int p;
		int a;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		Farmer[] a = new Farmer[m+1];
		for(int i = 1;i<=m;i++) {
			a[i] = new Farmer();
			a[i].p = reader.nextInt();
			a[i].a = reader.nextInt();
		}
		
		Arrays.sort(a,1,m+1,(x,y)->Integer.compare(x.p, y.p));
		
		int ans = 0;
		for(int i = 1;i<=m;i++) {
			if(n>=a[i].a) {
				ans+=a[i].p*a[i].a;
				n-=a[i].a;
			}else {
				ans+=n*a[i].p;
				break;
			}
		}
		System.out.println(ans);
	}

}

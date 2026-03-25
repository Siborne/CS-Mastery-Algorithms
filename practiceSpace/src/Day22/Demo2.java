package Day22;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	static class Node {
		double w;
		double v;
		double p;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		double c = reader.nextDouble();
		Node[] a = new Node[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = new Node();
			a[i].w = reader.nextDouble();
			a[i].v = reader.nextDouble();
			a[i].p = a[i].v / a[i].w;
		}

		Arrays.sort(a, 1, n + 1, (x, y) -> Double.compare(y.p, x.p));
		
		double sum = 0.0;
		for(int i = 1;i<=n;i++) {
			if(c>=a[i].w) {
				c-=a[i].w;
				sum+=a[i].v;
			}else {
				sum += c*a[i].p;
				break;
			}
		}
		System.out.printf("%.2f\n",sum);
	}

}

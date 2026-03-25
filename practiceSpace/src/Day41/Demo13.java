package Day41;

import java.util.ArrayList;
import java.util.List;

public class Demo13 {

	public static void main(String[] args) {
		long n = 2021041820210418L;
		long ans = 0;

		List<Long> list = new ArrayList<>();

		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				long j = n / i;
				if (j != i) {
					list.add(j);
				}
			}
		}

		for (long i : list) {
			for (long j : list) {
				for (long k : list) {
					if (i * j * k == n) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}

}

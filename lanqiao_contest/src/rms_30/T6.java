package rms_30;

import java.util.*;

public class T6 {

	public static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	public static long f(long n, long x, long y, long z, long lcm_xy, long lcm_xz, long lcm_yz, long lcm_xyz) {
		return n / x + n / y + n / z - n / lcm_xy - n / lcm_xz - n / lcm_yz + n / lcm_xyz;
	}

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		List<Long> results = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			long x = reader.nextLong();
			long y = reader.nextLong();
			long z = reader.nextLong();
			long k = reader.nextLong();

			long lcm_xy = lcm(x, y);
			long lcm_xz = lcm(x, z);
			long lcm_yz = lcm(y, z);
			long lcm_xyz = lcm(lcm_xy, z);

			long lo = 1;
			long hi = (long) 1e18;

			while (lo < hi) {
				long mid = (lo + hi) / 2;
				if (f(mid, x, y, z, lcm_xy, lcm_xz, lcm_yz, lcm_xyz) >= k) {
					hi = mid;
				} else {
					lo = mid + 1;
				}
			}

			results.add(lo);
		}

		for (long res : results) {
			System.out.println(res);
		}
		reader.close();
	}
}
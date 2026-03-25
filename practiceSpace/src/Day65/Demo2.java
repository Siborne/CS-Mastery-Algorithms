package Day65;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		List<Integer> list = eulerSieve(n);
		while (q-- > 0) {
			int x = Integer.parseInt(reader.readLine());
			writer.println(list.get(x-1));
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static List<Integer> eulerSieve(int n) {
		boolean[] isPrime = new boolean[n + 1];
		List<Integer> primes = new ArrayList<>();
//		primes.add(null);
		Arrays.fill(isPrime, true);

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && i * primes.get(j) <= n; j++) {
				isPrime[i * primes.get(j)] = false;
				if (i % primes.get(j) == 0) {
					break;
				}
			}

		}
		return primes;
	}

}

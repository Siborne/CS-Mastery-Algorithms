package Day45;

import java.util.*;

public class Demo2 {

	private static List<Integer> minp, primes;
	private static List<List<Integer>> adj, lis;
	private static int[] a;

	private static void sieve(int n) {
		minp = new ArrayList<>(Collections.nCopies(n + 1, 0));
		primes = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (minp.get(i) == 0) {
				minp.set(i, i);
				primes.add(i);
			}
			for (int p : primes) {
				if (i * p > n) {
					break;
				}
				minp.set(i * p, p);
				if (p == minp.get(i)) {
					break;
				}
			}
		}
	}

	private static void solve(Scanner reader) {
		// TODO Auto-generated method stub
		int n = reader.nextInt();
		sieve((int) Math.sqrt(1e9));
		
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = reader.nextInt();
		}

		adj = new ArrayList<>();
		lis = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
			lis.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			int u = reader.nextInt() - 1;
			int v = reader.nextInt() - 1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		dfs(0, -1);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (lis.get(i).size() >= 2) {
				Set<Integer> st = new HashSet<>();
				for(int v:lis.get(i)) {
					int tx = 1;
					for(int c: primes) {
						if(c>v) {
							break;
						}
						int cnt = 0;
						while(v%c==0) {
							cnt++;
							v/=c;
						}
						if(cnt%2==1) {
							tx*=c;
						}
					}
					if(v>1) {
						tx*=v;
					}
					if(st.contains(tx)) {
						ans++;
					}
					st.add(tx);
				}
			}
		}
		System.out.println(ans);
	}

	private static void dfs(int u, int f) {
		// TODO Auto-generated method stub
		for (int v : adj.get(u)) {
			if (v == f) {
				continue;
			}
			lis.get(u).add(a[v]);
			dfs(v, u);
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		solve(reader);
		reader.close();
	}
}

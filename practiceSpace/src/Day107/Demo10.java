package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.TreeSet;

public class Demo10 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static long ans;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			TreeSet<Integer> set = new TreeSet<>();

			set.add(192608170);
			set.add(-192608170);
			int n = (int) st.nval;
			ans = 0;

			for (int i = 0; i < n; i++) {
				st.nextToken();
				int x = (int) st.nval;
				if (set.size()==2) {
					ans+=x;
					set.add(x);
				}else {
					Integer k = set.ceiling(x);
					Integer a = set.floor(x);
					if (!k.equals(x)) {
						int dist1 = Math.abs(a-x);
						int dist2 = Math.abs(k-x);
						ans += Math.min(dist1, dist2);
						set.add(x);
					}
						
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}

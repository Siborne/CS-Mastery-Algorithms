package Day20;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Demo3 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(reader.readLine());
		Set<Integer> hasFriends = new HashSet<>();
		StringTokenizer st;
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(reader.readLine());
			int k = Integer.parseInt(st.nextToken());
			List<Integer> ids = new ArrayList<>();
			for(int j = 0;j<k;j++) {
				ids.add(Integer.parseInt(st.nextToken()));
			}
			
			if(k>1) {
				hasFriends.addAll(ids);
			}
		}
		
		
		int m = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		List<Integer> queries = new ArrayList<>();
		for(int i = 0;i<m;i++) {
			queries.add(Integer.parseInt(st.nextToken()));
		}
		
		LinkedHashSet<Integer> result = new LinkedHashSet<>();
		for(int id:queries) {
			if(!hasFriends.contains(id)) {
				result.add(id);
			}
		}
		
		if(result.isEmpty()) {
			System.out.println("No one is handsome");
		}else {
			StringBuilder sb = new StringBuilder();
			for(int id:result) {
				sb.append(String.format("%05d ", id));
			}
			System.out.println(sb.toString().trim());
		}
	}

}

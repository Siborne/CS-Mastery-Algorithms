package rms_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class T5 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Integer[] v = new Integer[n];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			v[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(v, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1,Integer o2) {
				return o2.compareTo(o1);
			}
		});

//        int ans = 0;
//        long temp = 0;
//        for(int i = 0;i<n;i++) {
//        	temp++;
//        	if(temp*v[i]>=k) {
//        		ans++;
//        		temp = 0;
//        	}
//        }

		int ans = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			count++;
			if (count * v[i] >= k) {
				ans++;
				count = 0;
			}
		}

		System.out.println(ans);
		reader.close();
	}
}
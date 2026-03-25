package Day27;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		String[] T = new String[n];
		reader.nextLine();
		StringTokenizer st = new StringTokenizer(reader.nextLine());
		for(int i = 0;i<n;i++) {
			T[i] = st.nextToken();
		}
		st = new StringTokenizer(reader.nextLine());
		int[] num = new int[n];
		int ans = 0;
		int max = 0;
		for(int i = 0;i<n;i++) {
			String s =st.nextToken();
			String[] ss = s.split("/");
			num[i] = Integer.parseInt(ss[0]);
			
			if(num[i]>max) {
				max = num[i];
				ans = i;
			}
		}
		System.out.println(T[ans]);
		
	}

}

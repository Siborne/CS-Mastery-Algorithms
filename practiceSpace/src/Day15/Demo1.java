package Day15;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo1 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		while(m-->0) {
			st = new StringTokenizer(reader.readLine());
			long sum = 0L;
			for(int i = 0;i<n;i++) {
				sum+= Integer.parseInt(st.nextToken());
			}
			writer.println(sum);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}

package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson11_T2_ERROR {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new BufferedOutputStream(System.out));

	}

	private static int n;
	private static String string, pattern;

	public static void main(String[] args) throws IOException {
		string = reader.readLine();
		n = Integer.parseInt(reader.readLine());
		while(n-->0) {
			pattern = reader.readLine();
			int index = string.indexOf(pattern);
			if(index==-1) {
				writer.println("Not Found");
				continue;
			}
			writer.println(string.substring(index));
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}

}

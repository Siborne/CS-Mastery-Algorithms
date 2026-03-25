package Day131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		TreeMap<Integer, String> map = new TreeMap<>();
		Map<String, Integer> indexMap = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			String[] strs = reader.readLine().split("\\s+");
			if (strs[0].equals("touch")) {
				String filename = strs[1];
				if (!indexMap.containsKey(filename)) {
					map.put(i, filename);
					indexMap.put(filename, i);
				}
			}else if (strs[0].equals("rm")) {
				String filename = strs[1];
				if (indexMap.containsKey(filename)) {
					int index = indexMap.get(filename);
					indexMap.remove(filename);
					map.remove(index);
				}
			}else if (strs[0].equals("ls")) {
				for (String string : map.values()) {
					writer.println(string);
				}
			}else {
				String filename = strs[1];
				String newFilename = strs[2];
				if (indexMap.containsKey(filename)&&!indexMap.containsKey(newFilename)) {
					int index = indexMap.get(filename);
					map.put(index, newFilename);
					indexMap.put(newFilename, index);
				}
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}

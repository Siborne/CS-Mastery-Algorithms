package week1.day7;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.TreeMap;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;

			TreeMap<Integer, Integer> myHorses = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int speed = (int) st.nval;
				myHorses.put(speed, myHorses.getOrDefault(speed, 0) + 1);
			}

			int[] tianHorses = new int[n];
			for (int i = 0; i < tianHorses.length; i++) {
				st.nextToken();
				tianHorses[i] = (int) st.nval;
			}

			int winCount = 0;

			for (int i = 0; i < n; i++) {
				int target = tianHorses[i];
				Integer winSpeed = myHorses.higherKey(target);

				if (winSpeed != null) {
					winCount++;
					removeHorse(myHorses, winSpeed);
				} else {
					Integer weakest = myHorses.firstKey();
					removeHorse(myHorses, weakest);
				}
			}

			writer.println(winCount);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void removeHorse(TreeMap<Integer, Integer> map, int speed) {
		int count = map.get(speed);
		if (count == 1) {
			map.remove(speed);
		} else {
			map.put(speed, count - 1);
		}
	}

}

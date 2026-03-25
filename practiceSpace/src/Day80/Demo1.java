package Day80;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			Set<Integer> xSet = new HashSet<>();
			Set<Integer> ySet = new HashSet<>();
			for (int i = 0; i < 4; i++) {
				xSet.add(reader.nextInt());
				ySet.add(reader.nextInt());
			}

			List<Integer> xList = new ArrayList<>(xSet);
			List<Integer> yList = new ArrayList<>(ySet);
			int side = Math.abs(xList.get(1)-xList.get(0));
			System.out.println(side*side);
		}

		reader.close();
	}

}

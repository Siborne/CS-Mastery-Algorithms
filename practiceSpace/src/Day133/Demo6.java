package Day133;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {

	class Solution {
		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> res = new ArrayList<>();
			for (int i = 0; i < numRows; i++) {
				List<Integer> line = new ArrayList<>();
				res.add(line);
				if (i == 0) {
					line.add(1);
					continue;
				}
				List<Integer> onLine = res.get(i - 1);
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						line.add(1);
						continue;
					}
					line.add(onLine.get(j) + onLine.get(j - 1));
				}
			}
			return res;
		}
	}

}

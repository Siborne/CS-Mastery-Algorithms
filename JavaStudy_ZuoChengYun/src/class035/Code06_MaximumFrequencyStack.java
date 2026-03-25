package class035;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code06_MaximumFrequencyStack {

	class FreqStack {
		private int topTimes;
		private Map<Integer, List<Integer>> cntValues;
		private Map<Integer, Integer> valueTimes;

		public FreqStack() {
			topTimes = 0;
			cntValues = new HashMap<>();
			valueTimes = new HashMap<>();
		}

		public void push(int val) {
			valueTimes.put(val, valueTimes.getOrDefault(val, 0) + 1);
			int curTopTime = valueTimes.get(val);
			if (!cntValues.containsKey(curTopTime)) {
				cntValues.put(curTopTime, new ArrayList<>());
			}
			List<Integer> curTimeValues = cntValues.get(curTopTime);
			curTimeValues.add(val);
			topTimes = Math.max(topTimes, curTopTime);
		}

		public int pop() {
			List<Integer> topTimeValues = cntValues.get(topTimes);
			int ans = topTimeValues.remove(topTimeValues.size() - 1);
			if (topTimeValues.size() == 0) {
				cntValues.remove(topTimes--);
			}
			int times = valueTimes.get(ans);
			if (times == 1) {
				valueTimes.remove(ans);
			} else {
				valueTimes.put(ans, times - 1);
			}
			return ans;
		}
	}

}

package class035;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Code04_InsertDeleteRandomDuplicatesAllowed {
	class RandomizedCollection {

		private Map<Integer, Set<Integer>> map;
		private List<Integer> arr;

		public RandomizedCollection() {
			map = new HashMap<>();
			arr = new ArrayList<>();
		}

		public boolean insert(int val) {
			arr.add(val);
			Set<Integer> set = map.getOrDefault(val, new HashSet<>());
			set.add(arr.size() - 1);
			map.put(val, set);
			return set.size() == 1;
		}

		public boolean remove(int val) {
			if (!map.containsKey(val)) {
				return false;
			}
			Set<Integer> valSet = map.get(val);
			int valAnyIndex = valSet.iterator().next();
			int endValue = arr.get(arr.size() - 1);
			if (val == endValue) {
				valSet.remove(arr.size() - 1);
			} else {
				Set<Integer> endValueSet = map.get(endValue);
				endValueSet.add(valAnyIndex);
				arr.set(valAnyIndex, endValue);
				endValueSet.remove(arr.size() - 1);
				valSet.remove(valAnyIndex);
			}
			arr.remove(arr.size() - 1);
			if (valSet.isEmpty()) {
				map.remove(val);
			}
			return true;
		}

		public int getRandom() {
			return arr.get((int) (Math.random() * arr.size()));
		}
	}
}

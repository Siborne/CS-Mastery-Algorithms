package class062;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Code06_WordLadderII {

	private static Set<String> dict;

	private static Set<String> curLevel = new HashSet<>();

	private static Set<String> nextLevel = new LinkedHashSet<>();

	private static Map<String, ArrayList<String>> graph = new HashMap<>();

	private static LinkedList<String> path = new LinkedList<>();

	private static List<List<String>> ans = new ArrayList<>();

	private static void build(List<String> wordList) {
		dict = new HashSet<>(wordList);
		graph.clear();
		ans.clear();
		curLevel.clear();
		nextLevel.clear();
	}

	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		build(wordList);
		if (!dict.contains(endWord)) {
			return ans;
		}
		if (bfs(beginWord, endWord)) {
			dfs(endWord, beginWord);
		}
		return ans;
	}

	private static boolean bfs(String begin, String end) {
		boolean find = false;
		curLevel.add(begin);
		while (!curLevel.isEmpty()) {
			dict.removeAll(curLevel);
			for (String word : curLevel) {
				char[] w = word.toCharArray();
				for (int i = 0; i < w.length; i++) {
					char old = w[i];
					for (char ch = 'a'; ch <= 'z'; ch++) {
						w[i] = ch;
						String str = String.valueOf(w);
						if (dict.contains(str)&&!str.equals(word)) {
							if (str.equals(end)) {
								find = true;
							}
							graph.putIfAbsent(str, new ArrayList<>());
							graph.get(str).add(word);
							nextLevel.add(str);
						}
					}
					w[i] = old;
				}
			}
			if (find) {
				return true;
			}else {
				Set<String> tmp = curLevel;
				curLevel = nextLevel;
				nextLevel = tmp;
				nextLevel.clear();
			}
		}
		return false;
	}

	private static void dfs(String word, String aim) {
		path.addFirst(word);
		if (word.equals(aim)) {
			ans.add(new ArrayList<>(path));
		}else if (graph.containsKey(word)) {
			for (String next : graph.get(word)) {
				dfs(next, aim);
			}
		}
		path.removeFirst();
	}
}

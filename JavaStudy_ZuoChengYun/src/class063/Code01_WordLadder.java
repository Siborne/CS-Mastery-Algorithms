package class063;

import java.util.HashSet;
import java.util.List;

public class Code01_WordLadder {

	public static int ladderLength(String begin, String end, List<String> wordList) {
		HashSet<String> dict = new HashSet<>(wordList);
		if (!dict.contains(end)) {
			return 0;
		}
		HashSet<String> smallLevel = new HashSet<>();
		HashSet<String> bigLevel = new HashSet<>();
		HashSet<String> nextLevel = new HashSet<>();
		smallLevel.add(begin);
		bigLevel.add(end);
		for (int len = 2; !smallLevel.isEmpty(); len++) {
			for (String w : smallLevel) {
				char[] word = w.toCharArray();
				for (int i = 0; i < word.length; i++) {
					char old = word[i];
					for (char change = 'a'; change <= 'z'; change++) {
						if (change != old) {
							word[i] = change;
							String next = String.valueOf(word);
							if (bigLevel.contains(next)) {
								return len;
							}
							if (dict.contains(next)) {
								dict.remove(next);
								nextLevel.add(next);
							}
						}
					}
					word[i] = old;
				}
			}
			if (nextLevel.size() <= bigLevel.size()) {
				HashSet<String> tmp = smallLevel;
				smallLevel = nextLevel;
				nextLevel = tmp;
			} else {
				HashSet<String> tmp = smallLevel;
				smallLevel = bigLevel;
				bigLevel = nextLevel;
				nextLevel = tmp;
			}
			nextLevel.clear();
		}
		return 0;
	}

}

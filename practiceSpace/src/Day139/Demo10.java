package Day139;

public class Demo10 {

	public boolean judgeCircle(String moves) {
		int UD = 0;
		int RL = 0;
		for (char c : moves.toCharArray()) {
			if ('R' == c) {
				RL++;
			} else if ('L' == c) {
				RL--;
			} else if ('U' == c) {
				UD++;
			} else {
				UD--;
			}
		}
		return UD == 0 && RL == 0;
	}

}

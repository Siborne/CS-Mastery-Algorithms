package Day129;

public class Demo6 {

	public static void main(String[] args) {
		int cnt = 0;
		int level = 0;
		int levelNeed = 0;
		while (cnt <= 20230610) {
			level++;
			levelNeed += level;
			cnt += levelNeed;
		}
		if (cnt > 20230610) {
			level--;
		}
		System.out.println(level);
	}

}

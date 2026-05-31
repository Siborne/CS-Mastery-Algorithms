package global;

public class T2 {

	private static final int MAXSUM = 20230610;
	
	public static void main(String[] args) {
		int sum = 0;
		int level = 0;
		int levelSum = 0;
		while (sum<=MAXSUM) {
			level++;
			levelSum+=level;
			sum+=levelSum;
		}
		System.out.println(level-1);
	}
	
}

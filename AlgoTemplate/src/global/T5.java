package global;

public class T5 {

	public static void main(String[] args) {
		long sum = 1;
		long nowLevel = 1;
		long nowLevelSum = 1;
		while (nowLevel < 20240601) {
			nowLevel++;
			nowLevelSum+=5;
			sum+=nowLevelSum;
		}
		System.out.println(sum);
	}

}

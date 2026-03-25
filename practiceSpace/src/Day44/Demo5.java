package Day44;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo5 {

	private static final Scanner reader = new Scanner(System.in);
	private static Map<Long, Result> map = new HashMap<>();

	public static void main(String[] args) {

	}

	private static Result ans(long r, int match) {
		Result res = new Result();
		if (r < 0 || match == 4) {
			assert false;
		}
		if (r == 0) {
			res.cnt = 0;
			return res;
		}
		long key = r * 9 + match;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		int[] _4931 = {1,3,9,4};
		for(int d= 0;d<10;d++) {
			int sub = 0;
	
		}

		return res;
	}

	private static long sum(long l, long r) {
		return (l + r) * (r - l + 1) / 2;
	}

	private static class Result {
		long cnt;
		long sum;

		public Result() {

		}

		public Result(long cnt, long sum) {
			this.cnt = cnt;
			this.sum = sum;
		}
	}

}

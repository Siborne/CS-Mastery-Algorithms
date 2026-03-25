package Day39;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	private static int ans;
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (long i = 0; i * i <= 9876543210L; i++) {
			long num = i * i;
			check(num);
		}
		dfs(0,0);
		System.out.println(ans);
	}

	private static void check(long num) {
		int status = 0;
		if (num == 0) {
			status = 1;
		}
		while (num != 0) {
			if ((status & (1 << (num % 10))) != 0) {
				return;
			}
			status |= (1 << (num % 10));
			num /= 10;
		}
		list.add(status);
	}

	private static void dfs(int x, int y) {
		if (y == (1 << 10) - 1) {
			ans++;
			return;
		}
		for(int i = x;i<list.size();i++) {
			if((list.get(i) & y)==0) {
				dfs(i+1,list.get(i)|y);
			}
		}
	}

}

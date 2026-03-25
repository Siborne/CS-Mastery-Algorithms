package Day47;

import java.util.Scanner;

public class Demo2 {

	private static int[] step = new int[100000];
	private static int[] bfs = new int[100000];
	private static boolean[] use = new boolean[1000];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int temp;
		int state = 0;
		for (int i = 0; i < 9; i++) {
			temp = reader.nextInt();
			state = state * 2 + temp;
		}

		bfs[0] = state;
		step[0] = 0;
		use[bfs[0]] = true;
		
		int head = 0;
		int tail = 0;
		
		while(head<=tail) {
			for(int i = 0;i<9;i++) {
				bfs[++tail] = change(bfs[head],i);
				step[tail] = step[head]+1;
				
				if(bfs[tail] == (1<<9)-1) {
					System.out.println(step[tail]);
					return;
				}
				
				if(use[bfs[tail]]) {
					tail--;
				}else {
					use[bfs[tail]] = true;
				}
			}
			head++;
		}

		reader.close();
	}
	
	private static int change(int x, int pos) {
		int re = x;
		re ^= 1<<(8 - pos);
		if(pos % 3 != 0) {
			re ^= 1<<(9-pos);
		}
		if(pos % 3 != 2) {
			re ^= 1<<(7-pos);
		}
		
		if(pos/3!=0) {
			re ^= 1<<(11-pos);
		}
		
		if(pos/3!=2) {
			re ^= 1<<(5-pos);
		}
		
		return re;
	}

}

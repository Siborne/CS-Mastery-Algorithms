package Day35;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for(int i = 2;i<100;i++) {
			for(int j = i;j<100;j++) {
				sum+=j;
				count++;
				if(sum-(count-1)==100&&(count-1)>i&&(count-1)<j) {
					System.out.println(count-1);
					break;
				}
			}
			sum = 0;
			count = 0;
		}
		reader.close();
	}

}

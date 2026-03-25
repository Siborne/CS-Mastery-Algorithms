package Day62;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		for(int i = 1;i<10000;i++) {
			if(i%3!=0&&i%10!=3) {
				list.add(i);
			}
		}
		
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			System.out.println(list.get(x));
		}
		
		reader.close();
	}
	
}

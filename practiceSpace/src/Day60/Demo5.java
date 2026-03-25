package Day60;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		int i = 0;
		int j = n-1;
		int Sereja = 0;
		int Dima = 0;
		boolean who = false;
		while(i<=j) {
			if(who) {
				if(arr[j]>arr[i]) {
					Dima+=arr[j];
					j--;
				}else {
					Dima+=arr[i];
					i++;
				}
				who = false;
			}else {
				if(arr[j]>arr[i]) {
					Sereja+=arr[j];
					j--;
				}else {
					Sereja+=arr[i];
					i++;
				}
				who = true;
			}
		}
		System.out.println(Sereja + " " + Dima);
		reader.close();
	}

}

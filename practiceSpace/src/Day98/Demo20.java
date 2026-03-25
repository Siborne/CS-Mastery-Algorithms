package Day98;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] a = reader.nextLine().split("!");
		String b = reader.nextLine();
		StringBuilder sb = new StringBuilder();
		for (String s : a) {
			sb.append(s);
		}
		System.out.println(sb.toString().contains(b) ? "True" : "False");
		reader.close();
	}

}

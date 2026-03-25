package Day129;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String[] arr = new String[]{
			"",
			"FZU",
			"FNU",
			"FZU",
			"FZU",
			"FAFU",
			"HQU",
			"MJU",
			"XMUT",
			"QNU",
			"JMU",
			"FZU"
		};
		
		System.out.println(arr[reader.nextInt()]);
		
		reader.close();
	}

}

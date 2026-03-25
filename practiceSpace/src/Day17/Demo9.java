package Day17;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char chs = (char)('A'+(a-1));
        System.out.println(chs);
        scan.close();
	}

}

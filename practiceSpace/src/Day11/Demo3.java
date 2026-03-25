package Day11;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        for(int i  = 0;i<n;i++){
            res ^= scan.nextInt();
        }
        System.out.println(res);
        scan.close();
    }
}

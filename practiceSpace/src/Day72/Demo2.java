package Day72;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            if (k == 1) {
                boolean sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
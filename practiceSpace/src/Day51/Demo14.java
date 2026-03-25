package Day51;

import java.util.Scanner;

public class Demo14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 判断是否能被幸运数字整除
        if (n % 4 == 0 || n % 7 == 0 || n % 74 == 0 || n % 47 == 0 || n % 44 == 0 || n % 77 == 0) {
            System.out.println("YES");
        } else {
            // 检查数字的每一位是否都是幸运数字
            while (n != 0) {
                int t = n % 10;
                if (t != 4 && t != 7) {
                    System.out.println("NO");
                    return;
                }
                n /= 10;
            }
            System.out.println("YES");
        }
        
        scanner.close();
    }
}

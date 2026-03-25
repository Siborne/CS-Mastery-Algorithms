package Day63;

import java.util.Scanner;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            String s = scanner.next();
            if (s.equals("abc")) {
                System.out.println("YES");
                continue;
            }

            boolean possible = false;
            if (swap(s, 0, 1).equals("abc")) possible = true;
            if (swap(s, 0, 2).equals("abc")) possible = true;
            if (swap(s, 1, 2).equals("abc")) possible = true;

            System.out.println(possible ? "YES" : "NO");
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
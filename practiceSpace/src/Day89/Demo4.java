package Day89;

import java.io.*;
import java.util.*;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] a = new int[n + 1]; // 1-indexed

            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(input[i - 1]);
            }

            List<Integer> p = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    p.add(a[i]);
                } else {
                    if (a[i] >= a[i - 1]) {
                        p.add(a[i]);
                    } else {
                        p.add(a[i]);
                        p.add(a[i]); // 下降时加两次
                    }
                }
            }

            // 输出
            System.out.println(p.size());
            for (int i = 0; i < p.size(); i++) {
                System.out.print(p.get(i) + " ");
            }
            System.out.println();
        }
    }
}
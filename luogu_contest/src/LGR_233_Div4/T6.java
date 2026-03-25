package LGR_233_Div4;

import java.util.Scanner;

import java.util.*;

public class T6 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int q = reader.nextInt();
        long[][] a = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = reader.nextLong();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int k = reader.nextInt();
            boolean[] delRow = new boolean[n];
            boolean[] delCol = new boolean[n];
            int[] delRows = new int[k];
            int[] delCols = new int[k];

            for (int i = 0; i < k; i++) {
                int r = reader.nextInt() - 1;
                delRow[r] = true;
                delRows[i] = r;
            }
            for (int i = 0; i < k; i++) {
                int c = reader.nextInt() - 1;
                delCol[c] = true;
                delCols[i] = c;
            }

            List<Integer> rows = new ArrayList<>();
            List<Integer> cols = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!delRow[i]) rows.add(i);
                if (!delCol[i]) cols.add(i);
            }
            int sizeB = n - k;

            long mainB = 1, antiB = 1;
            for (int i = 0; i < sizeB; i++) {
                int r = rows.get(i);
                int c1 = cols.get(i);
                mainB = (mainB * a[r][c1]) % MOD;
                int c2 = cols.get(sizeB - 1 - i);
                antiB = (antiB * a[r][c2]) % MOD;
            }
            long fB = (mainB - antiB) % MOD;

            long mainC = 1, antiC = 1;
            for (int i = 0; i < k; i++) {
                int r = delRows[i];
                int c1 = delCols[i];
                mainC = (mainC * a[r][c1]) % MOD;
                int c2 = delCols[k - 1 - i];
                antiC = (antiC * a[r][c2]) % MOD;
            }
            long fC = (mainC - antiC) % MOD;

            long ans = (fB * fC) % MOD;
            ans = (ans + MOD) % MOD;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        reader.close();
    }
}
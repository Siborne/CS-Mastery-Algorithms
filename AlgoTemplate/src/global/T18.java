package global;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T18 {

    private static int n;
    private static int[] path;      
    private static boolean[] used;  
    private static List<int[]> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        path = new int[n];
        used = new boolean[n + 1]; 

        dfs(0);

        StringBuilder sb = new StringBuilder();
        for (int[] brr : ans) {
            for (int j = 0; j < brr.length; j++) {
                sb.append(brr[j]);
                if (j < brr.length - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        reader.close();
    }

    private static void dfs(int index) {
        if (index == n) {
            ans.add(path.clone());
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                path[index] = i;
                dfs(index + 1);
                used[i] = false;
            }
        }
    }
}
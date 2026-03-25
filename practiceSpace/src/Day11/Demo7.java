package Day11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Demo7 {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
    public static int n; // 地宫的行数
    public static int m; // 地宫的列数
    public static int k; // 需要恰好取k件宝贝
    public static long[][][][] dp; // DP数组，用于记忆化搜索
    public static long mod = (long) 1e9 + 7; // 模数

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(reader.readLine());
        // 读取输入并赋值给静态变量
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        dp = new long[50][50][14][13]; // 初始化DP数组
        int[][] grid = new int[n][m]; // 存储每个格子的宝物价值

        // 读取地宫宝物价值
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 初始化DP数组为-1，表示未计算
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                for (int k = 0; k < 14; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }

        // 从起点(0,0)开始搜索，初始最大价值为-1（未取任何宝物），已取0件
        System.out.println(dfs(0, 0, -1, 0, grid));
        writer.flush();
    }

    public static long dfs(int x, int y, int maxVal, int count, int[][] grid) {
        // 如果已计算过该状态，直接返回结果
        if (dp[x][y][maxVal + 1][count] != -1) {
            return dp[x][y][maxVal + 1][count];
        }

        // 越界或已取超过k件，无效路径
        if (x >= n || y >= m || count > k) {
            return 0;
        }

        // 到达终点时的处理
        if (x == n - 1 && y == m - 1) {
            // 已取k件，有效方案
            if (count == k) {
                return 1;
            }
            // 已取k-1件，且终点宝物可拿，有效方案
            if (count == k - 1 && grid[x][y] > maxVal) {
                return 1;
            }
            // 其他情况无效
            return 0;
        }

        long res = 0;
        int currentVal = grid[x][y];

        // 当前宝物价值大于手中最大，可选择拿或不拿
        if (currentVal > maxVal) {
            // 拿当前宝物，向下和向右移动
            res += dfs(x + 1, y, currentVal, count + 1, grid);
            res += dfs(x, y + 1, currentVal, count + 1, grid);
            // 不拿当前宝物，向下和向右移动
            res += dfs(x + 1, y, maxVal, count, grid);
            res += dfs(x, y + 1, maxVal, count, grid);
        } else {
            // 不能拿当前宝物，向下和向右移动
            res += dfs(x + 1, y, maxVal, count, grid);
            res += dfs(x, y + 1, maxVal, count, grid);
        }

        // 取模并更新DP数组
        res %= mod;
        dp[x][y][maxVal + 1][count] = res;
        return res;
    }
}
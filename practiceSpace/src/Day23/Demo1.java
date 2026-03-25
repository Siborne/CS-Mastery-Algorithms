package Day23;

import java.util.Scanner;

public class Demo1 {

    private static final int N = 100005;
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // 输入变量
        int n = reader.nextInt();
        int[] f = new int[N]; // 统计每个长度出现的次数
        int s = Integer.MAX_VALUE; // 最小长度
        int e = Integer.MIN_VALUE; // 最大长度
        long ans = 0; // 答案

        // 读取输入并更新最小值、最大值以及频率数组
        for (int i = 1; i <= n; i++) {
            int x = reader.nextInt();
            s = Math.min(s, x);
            e = Math.max(e, x);
            f[x]++;
        }

        // 枚举所有可能的三角形组合
        for (int i = s + 1; i <= e; i++) {
            if (f[i] <= 1) continue; // 不可能组成三角形

            for (int j = s; j <= i / 2; j++) {
                if (f[j] > 0 && f[i - j] > 0) { // 能组成三角形
                    if (j != i - j) {
                        // j 和 i-j 不相等的情况
                        ans = (ans + 
                               (((long) f[i] * (f[i] - 1) / 2) % MOD) * 
                               (((long) f[j] * f[i - j]) % MOD) % MOD) % MOD;
                    } else if (f[j] >= 2) {
                        // j 和 i-j 相等的情况
                        ans = (ans + 
                               (((long) f[i] * (f[i] - 1) / 2) % MOD) * 
                               (((long) f[j] * (f[j] - 1) / 2) % MOD) % MOD) % MOD;
                    }
                }
            }
        }

        // 输出结果
        System.out.println(ans);
        reader.close(); // 关闭输入流
    }
}

package Day43;

import java.util.*;

public class Demo9 {
    static int n, m;
    static int[] l; //l[i]:第i个羊圈能覆盖的连续的羊数量
    static double[] p; //羊逃跑的概率
    static double[][] dp; //记忆化数组，存储状态（i，j）的最小期望逃跑数
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //羊圈数量
        m = sc.nextInt(); //羊的数量
        l = new int[n];
        for(int i = 0; i < n; i++) {
            l[i] = sc.nextInt(); //存储每个羊圈能覆盖的连续羊的数量
        }
        p = new double[m];
        for(int i = 0; i < m; i++) {
            p[i] = sc.nextDouble(); //存储每一只羊逃跑的概率
        }
        /*初始化动态规划记忆化数组dp
         * 一维m表示羊的位置（0 ~ m - 1）
         * 二维1<< n:表示羊圈使用状态的位掩码
         * 初始值设置为-1表示该状态未被计算
         */
        dp = new double[m][1<<n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        //初始状态：从第0只羊开始（羊的位置索引从0开始），所有羊圈都可用 (1<< n )- 1(例如：1000 --> 0111)
        // 1:代表使用了羊圈，0:代表未使用羊圈
        double result = cal(0,(1<< n )- 1);
//        System.out.printf("%.2%f\n",result); //理解为C语言中的输出
        System.out.println(String.format("%.2f", result));
    }
    /*
     * 递归计算最小的期望逃跑数（带记忆化）
     * @param i 当前考虑的羊的索引位置
     * @param j 可用羊圈的位掩码（二进制为1表示可用）
     * @return 从状态（i，j）开始的最小期望逃跑数 
     */
    public static double cal(int i, int j) {
        //结束条件：已经考虑完毕所有羊，无法再减少逃跑数
        if(i >= m) {
            return 0;
        }
        //记忆化检查：如果该状态已计算，直接返回结果
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        //初始化最小期望值为一个较大的数
        double minExpected = Double.MAX_VALUE;
        //遍历所有羊圈
        for(int t = 0; t < n; t++) {
            //检查第t个数是否可用（位掩码的第t位是否为1）
            if((j &(1 << t)) != 0) {
                /*
                 * 选择使用第t个羊圈:
                 * 1.该羊圈覆盖从i开始的l[t]只羊
                 * 2.羊的位置直接跳到i + l[t]
                 * 3.更新羊圈的状态（将第t位置为0：表示该羊圈被使用)
                 */
                minExpected = Math.min(minExpected, cal(i + l[t],j & ~(1 << t)));
            }
        }
        /*
         * 选择不使用任何羊圈：
         * 1.当前羊i有p[i]概率逃跑
         * 2.继续考虑下一只羊（i+1）
         * 3.羊圈状态保持不变
         */
        minExpected = Math.min(minExpected, cal(i + 1,j)+p[i]);
        //将计算结果存入记忆化数组中
        dp[i][j] = minExpected;
        return minExpected;
    }
}
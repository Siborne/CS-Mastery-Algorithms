package Day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = 0; // 最大连续匹配次数
        int now = 1; // 当前连续匹配次数
        long firstTime = 0; // 第一个时间戳
        boolean flag = false; // 标记是否是第一次处理

        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            String yesChar = st.nextToken();
            String xiaolanChar = st.nextToken();
            long time = Long.parseLong(st.nextToken());

            if (!flag) {
                // 初始化第一个时间戳
                flag = true;
                firstTime = time;
                continue;
            }

            if (yesChar.equals(xiaolanChar) && time - firstTime <= 1000) {
                now++; // 当前匹配成功
            } else {
                k = Math.max(k, now); // 更新最大匹配次数
                now = 1; // 重置当前计数
            }
            firstTime = time; // 更新时间戳
        }

        // 循环结束后，再次更新最大值
        k = Math.max(k, now);
        System.out.println(k);
    }
}
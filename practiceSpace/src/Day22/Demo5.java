package Day22;

import java.util.*;

public class Demo5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        // 统计每个能力值出现的次数
        for (int i = 0; i < n; i++) {
            int t = reader.nextInt();
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        while (!map.isEmpty()) {
            // 获取第一个键值对
            Map.Entry<Integer, Integer> firstEntry = map.entrySet().iterator().next();
            int key = firstEntry.getKey();
            int value = firstEntry.getValue();

            // 减少当前能力值的计数
            if (value == 1) {
                map.remove(key); // 如果计数降为 0，则移除该键
            } else {
                map.put(key, value - 1);
            }

            int t = 1; // 当前连续段长度
            int prevKey = key;
            int prevValue = value - 1;

            // 创建一个新的列表存储需要删除的键
            List<Integer> keysToRemove = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int currentKey = entry.getKey();
                int currentValue = entry.getValue();

                if (currentKey == prevKey + 1 && currentValue > prevValue) {
                    t++;
                    if (currentValue == 1) {
                        keysToRemove.add(currentKey); // 标记需要删除的键
                    } else {
                        map.put(currentKey, currentValue - 1); // 更新计数
                    }
                    prevKey = currentKey;
                    prevValue = currentValue - 1;
                } else {
                    break; // 不满足条件时退出循环
                }
            }

            // 删除标记的键
            for (int k : keysToRemove) {
                map.remove(k);
            }

            // 更新答案
            ans = Math.min(ans, t);
        }

        // 输出结果
        System.out.println(ans);
        reader.close();
    }
}
package Day39;

import java.util.Scanner;

public class Demo7 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
         
        // 生成自然数拼接字符串，长度为 4n - 4（总边数）
        StringBuilder sbFull = new StringBuilder();
        for (int i = 1; i <= 4 * n; i++) {
            sbFull.append(i);
        }
        String s = sbFull.toString();

        // 逐行绘制
        for(int i = 0; i < n; i++) {
            draw(i, n, s);
        }

        reader.close();
    }

    public static void draw(int row, int n, String s) {
        char[] line = new char[n + row]; // 当前行长度为 n + row
        // 初始化为 '.'
        for (int i = 0; i < line.length; i++) {
            line[i] = '.';
        }

        if (row == 0) {
            // 顶点：只填第一个数字
            line[n - 1] = s.charAt(0); // 第一个数字 '1'
        } else if (row < n - 1) {
            // 左边和右边斜边中间部分
            int leftIndex = n - row - 1;
            int rightIndex = n + row - 1;

            // 左边斜边：第 row 个数字
            line[leftIndex] = s.charAt(row);

            // 右边斜边：第 3n - 2 + (row - 1) 个数字
            line[rightIndex] = s.charAt(3 * n - 2 + (row - 1));
        } else if (row == n - 1) {
            // 底边：从第 n 到第 3n - 2 的数字
            for (int i = 0; i < 2 * n - 1; i++) {
                int index = n + i - 1;
                if (index < s.length()) {
                    line[i] = s.charAt(index);
                }
            }
        }

        System.out.println(new String(line));
    }
}
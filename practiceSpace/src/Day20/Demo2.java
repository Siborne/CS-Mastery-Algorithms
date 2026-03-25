package Day20;

import java.util.Scanner;


public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的一行字符串
        String input = scanner.nextLine();

        // 调用方法处理字符串并输出结果
        System.out.println(processString(input));

        scanner.close();
    }

    /**
     * 处理字符串，将连续的6替换为9或27
     * @param str 输入的字符串
     * @return 处理后的字符串
     */
    private static String processString(String str) {
        StringBuilder result = new StringBuilder(); // 用于存储处理后的字符串
        int count = 0; // 记录连续的6的数量

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '6') {
                count++; // 遇到6时计数加1
            } else {
                // 如果当前字符不是6，且之前有连续的6需要处理
                if (count > 0) {
                    if (count > 9) {
                        result.append("27"); // 超过9个连续的6，替换成27
                    } else if (count > 3) {
                        result.append("9"); // 超过3个但不超过9个连续的6，替换成9
                    } else {
                        // 使用替代方法生成重复的6
                        result.append(repeatChar('6', count)); // 不超过3个连续的6，保持原样
                    }
                    count = 0; // 重置计数器
                }
                result.append(ch); // 将当前字符添加到结果中
            }
        }

        // 处理最后一段可能存在的连续6
        if (count > 0) {
            if (count > 9) {
                result.append("27");
            } else if (count > 3) {
                result.append("9");
            } else {
                result.append(repeatChar('6', count));
            }
        }

        return result.toString();
    }

    /**
     * 生成由指定字符重复多次组成的字符串（Java 8 兼容）
     * @param ch 要重复的字符
     * @param count 重复次数
     * @return 重复后的字符串
     */
    private static String repeatChar(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
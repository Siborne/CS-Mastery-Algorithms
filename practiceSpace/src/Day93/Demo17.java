package Day93;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String input = reader.nextLine(); // 读取整行，如 "3+5"
        
        int len = input.length();
        double a = 0, b = 0;
        char op = ' ';
        
        // 从左到右查找运算符（跳过第一个字符，防止误判负号）
        for (int i = 1; i < len; i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                op = ch;
                // 提取 a 和 b
                try {
                    a = Double.parseDouble(input.substring(0, i));
                    b = Double.parseDouble(input.substring(i + 1));
                } catch (Exception e) {
                    // 题目保证合法输入，可忽略
                }
                break;
            }
        }
        
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b; // 题目保证 b != 0
                break;
        }
        
        // 输出保留 6 位小数
        System.out.printf("%.6f%n", result);
        
        reader.close();
    }
	
}

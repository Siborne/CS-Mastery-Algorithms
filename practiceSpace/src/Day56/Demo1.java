package Day56;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        // 判断是否满足 Caps Lock 错误的情况
        boolean allUpperCase = true;
        for (char c : word.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                allUpperCase = false;
                break;
            }
        }

        if (allUpperCase) {
            // 全部是大写，转换成全部小写
            System.out.println(word.toLowerCase());
        } else if (word.length() > 1 &&
                   Character.isLowerCase(word.charAt(0)) &&
                   word.substring(1).chars().allMatch(Character::isUpperCase)) {
            // 第一个字母小写，其余都是大写
            String result = Character.toUpperCase(word.charAt(0)) +
                            word.substring(1).toLowerCase();
            System.out.println(result);
        } else {
            // 不符合规则，原样输出
            System.out.println(word);
        }
    }
}
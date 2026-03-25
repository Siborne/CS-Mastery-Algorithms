package Day73;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	
	public static void main(String[] args) throws IOException {
		List<Deque<Character>> target = new ArrayList<>();
        List<Deque<Character>> input = new ArrayList<>();

        // 第一部分：读取 target 文本
        while (true) {
            String line = reader.readLine();
            if (line.equals("EOF")) break;
            Deque<Character> stack = new LinkedList<>();
            for (char c : line.toCharArray()) {
                if (c == '<') {
                    if (!stack.isEmpty()) {
                        stack.pollLast();
                    }
                } else if ((c >= 'a' && c <= 'z') || c == ' ' || c == '.') {
                    stack.offerLast(c);
                }
            }
            target.add(stack);
        }

        // 第二部分：读取 input 文本
        while (true) {
            String line = reader.readLine();
            if (line.equals("EOF")) break;
            Deque<Character> stack = new LinkedList<>();
            for (char c : line.toCharArray()) {
                if (c == '<') {
                    if (!stack.isEmpty()) {
                        stack.pollLast();
                    }
                } else if ((c >= 'a' && c <= 'z') || c == ' ' || c == '.') {
                    stack.offerLast(c);
                }
            }
            input.add(stack);
        }

        // 读取时间
        double time = Double.parseDouble(reader.readLine());

        long count = 0;
        int limit = Math.min(target.size(), input.size());

        for (int i = 0; i < limit; i++) {
            Deque<Character> stack1 = target.get(i);
            Deque<Character> stack2 = input.get(i);

            Iterator<Character> it1 = stack1.iterator();
            Iterator<Character> it2 = stack2.iterator();

            int len = Math.min(stack1.size(), stack2.size());
            for (int j = 0; j < len; j++) {
                if (it1.next() == it2.next()) {
                    count++;
                }
            }
        }

        // 计算 KPM
        long res = (long) Math.round(count * 60.0 / time);
        writer.println(res);
        writer.flush();
        writer.close();
        reader.close();
	}
	
}
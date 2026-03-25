package Day3;

import java.util.*;
import java.io.*;

public class Demo1{
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream writer = new PrintStream(new BufferedOutputStream(System.out));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        String[] num = reader.readLine().split(" ");
        for(int i = 0;i<n;i++){
            queue.add(Integer.parseInt(num[i]));
        }

        int ans = 0;
        for(int i = 0;i<n-1;i++){
            int x = queue.poll();
            int y = queue.poll();
            int z = x+y;
            ans += z;
            queue.add(z);
        }
        writer.println(ans);
        writer.flush();
    }
    
}
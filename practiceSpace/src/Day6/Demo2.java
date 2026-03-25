package Day6;

import java.util.*;
import java.io.*;

public class Demo2{
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        st = new StringTokenizer(reader.readLine());
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            ans = ans^x;
        }
        System.out.println(ans);
    }
    
}
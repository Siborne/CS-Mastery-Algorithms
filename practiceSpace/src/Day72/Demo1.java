package Day72;

import java.util.*;

public class Demo1{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = a+b;
        StringBuilder sb = new StringBuilder(String.valueOf(c));
        if(c<1000&&c>-1000){
            System.out.println(c);
            return;
        }
        int startIndex = c<0?1:0;
        for(int i = sb.length()-3;i>startIndex;i-=3) {
        	sb.insert(i, ",");
        }
        System.out.println(sb);
        reader.close();
    }
}

package Day10;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
//1:无需package
//2: 类名必须Main, 不可修改

public class Demo1 {
 public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
 public static void main(String[] args) throws IOException{

	 StringTokenizer st = new StringTokenizer(reader.readLine());
     int n = Integer.parseInt(st.nextToken());
     int q = Integer.parseInt(st.nextToken());
     long[] arr = new long[n];
     st = new StringTokenizer(reader.readLine());
     for(int i = 0;i<n;i++){
         arr[i] = Integer.parseInt(st.nextToken());
     }
     long[] diff = new long[n];
     for(int i = 0;i<n;i++){
    	 if(i==0) {
    		 diff[i] = arr[i];
    		 continue;
    	 }
    	 diff[i] = arr[i]-arr[i-1];
     }
     while(q-->0) {
    	 st = new StringTokenizer(reader.readLine());
    	 int l = Integer.parseInt(st.nextToken())-1;
    	 int r = Integer.parseInt(st.nextToken());
    	 int x = Integer.parseInt(st.nextToken());
    	 diff[l]+=x;
    	 if (r < n) {
             diff[r] -= x;
         }
     }

     StringBuilder sb = new StringBuilder();
     for(int i = 0;i<n;i++) {
    	 if(i==0) {
    		 arr[i] = diff[i];
    	 }else {
    		 arr[i] = diff[i]+arr[i-1];
    	 }
    	 if(arr[i]<0) {
    		 sb.append(0);
    	 }else {
    		 sb.append(arr[i]);
    	 }
    	 sb.append(" ");
     }
     
     writer.print(sb.toString().trim());
     
     writer.flush();
     writer.close();
     reader.close();
 }
}
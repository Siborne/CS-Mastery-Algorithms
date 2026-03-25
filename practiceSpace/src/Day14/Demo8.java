package Day14;

import java.util.*;
//1:无需package
//2: 类名必须Main, 不可修改

public class Demo8 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int[] arr = new int[n];
     int[] brr = new int[n];
     int[] crr = new int[n];
     for(int i = 0;i<n;i++){
         arr[i] = scan.nextInt();
     }
     for(int i = 0;i<n;i++){
         brr[i] = scan.nextInt();
     }
     for(int i = 0;i<n;i++){
         crr[i] = scan.nextInt();
     }
     long[] a = new long[n];
     long[] b = new long[n];
     long[] c = new long[n];
     for(int i = 0;i<n;i++){
         a[i] = arr[i]-brr[i]-crr[i];
         b[i] = brr[i]-arr[i]-crr[i];
         c[i] = crr[i]-brr[i]-arr[i];
     }

     Arrays.sort(a);
     Arrays.sort(b);
     Arrays.sort(c);
     int max = -1;
     for(int i = n-1;i>=0;i--){
         if(i<n-1){
             a[i]+=a[i+1];
             b[i]+=b[i+1];
             c[i]+=c[i+1];
         }

         if(a[i]>0||b[i]>0||c[i]>0){
             max=n-i;
         }

     }
     System.out.println(max);
     scan.close();
 }
}
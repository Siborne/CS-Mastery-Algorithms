package Day14;

import java.util.Arrays;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] f = new int[n][2];
        int[] a = new int[10];
        for(int i = 0;i<n;i++){
            f[i][0] = scan.nextInt();
            f[i][1] = scan.nextInt();
            a[f[i][0]]++;
        }

        Arrays.sort(f,(o1,o2)->o1[1]-o2[1]);

        long res = 0;
        for(int i = 0;i<n;i++){
            if(a[f[i][0]]>n/10){
                res+=f[i][1];
                a[f[i][0]]--;
            }
        }
        System.out.println(res);

        scan.close();
    }
}
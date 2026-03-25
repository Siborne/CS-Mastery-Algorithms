package rms_30;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++) {
        	arr[i] = reader.nextInt();
        }
        Arrays.sort(arr);
        int maxLen = m-arr[n-1]+arr[0];
        
        for(int i = 0;i<n-1;i++) {
        	int temp = arr[i+1]-arr[i];
        	maxLen = Math.max(temp, maxLen);
        }
        
        int ans = m-maxLen;
        System.out.println(ans);
        
        reader.close();
    }
    
}

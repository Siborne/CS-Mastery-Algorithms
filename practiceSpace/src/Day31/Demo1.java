package Day31;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        int ans;
        int sum = 0;
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
            sum+=arr[i];
        }
        if(sum<m){
            ans=-1;
        }else{
            int i = 0;
            int j = 0;
            int now = 0;
            int cnt = 0;
            while(j<n){
                if(now<m){
                    now+=arr[j];
                    if(now>=m) {
                    	cnt+=j-i;
                    	i=j;
                    }
                    j++;
                }else{
                    now = 0;
                    j++;
                    i=j;
                }
//                System.out.print(cnt+" ");
            }
            if(now<m&&now!=0) {
            	cnt+=j-i;
            	cnt++;
            }
            ans = cnt;
        }
        System.out.println(ans);
        scan.close();
	}

}

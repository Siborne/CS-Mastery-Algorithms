package Day3;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int[] data = new int[200];

        for(int i = 0; i < 200; i++){
            data[i] = 4 * i + 6;
        }

        int target = scan.nextInt();
        scan.close();
        int left = 0;
        int right = data.length-1;
        while(left<right){
            int mid = (left+right)>>>1;
            if(data[mid]==target){
                System.out.println(mid);
                return;
            }else if(data[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
    }
}
package Day5;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        while(scan.hasNext()){
            String option = scan.next();
            if(option.equals("add")){
                int x = scan.nextInt();
                arr[0]++;
            }else if(option.equals("sync")){
                int x = scan.nextInt();
                arr[x] = Math.min(arr[x]+1,arr[0]);
            }else{
                int min = arr[0];
                for(int num:arr){
                    min = Math.min(min,num);
                }
                System.out.println(min);
            }
        }
        scan.close();
    }
	
}

package Day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr,new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				// TODO Auto-generated method stub
				boolean isAEven = a%2==0;
        		boolean isBEven = b%2==0;
        		
        		if(isAEven&&!isBEven) {
        			return 1;
        		}else if(!isAEven&&isBEven) {
        			return -1;
        		}else {
        			return Integer.compare(a, b);
        		}
			}
        	
		});
        for(int num:arr) {
        	System.out.print(num + " ");
        }
        scan.close();
    }
	
}

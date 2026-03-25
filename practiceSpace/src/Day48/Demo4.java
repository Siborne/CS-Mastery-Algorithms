package Day48;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
	        
	        //在此输入您的代码...
	        for(int i = 98765432;i>=10000000;i--){
	            if(i%9!=0){
	                continue;
	            }
	            int[] arr = new int[10];
	            int temp = i;
	            boolean flag = true;
	            while(temp >0 ) {
	            	if(arr[temp%10]!=0) {
	            		flag = false;
	            		break;
	            	}
	            	arr[temp%10]++;
	            	temp/=10;
	            }
	            if(flag) {
	            	System.out.println(i);
	            	break;
	            }
	        }
	    }

}

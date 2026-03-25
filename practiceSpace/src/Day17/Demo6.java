package Day17;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        for(int i = 1;i<=99;i++){
            int lf = i*i*i;
            String lfStr = String.valueOf(lf);
            if(lfStr.length()!=4) {
            	continue;
            }
            int scf = lf*i;
            String scfStr = String.valueOf(scf);
            if(scfStr.length()!=6) {
            	continue;
            }
            String zong = lfStr+scfStr;
            int[] arr = new int[10];
            for(char ch:zong.toCharArray()) {
            	arr[ch-'0']++;
            }
            boolean flag = true;
            for(int j = 0;j<10;j++) {
            	if(arr[j]!=1) {
            		flag = false;
            		break;
            	}
            }
            
            if(flag) {
            	System.out.println(i);
            }
            
        }
        scan.close();
	}

}

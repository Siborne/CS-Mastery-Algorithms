package Day2;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Demo1 {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        for(char c1 = 'A';c1<='D';c1++){
	            for(char c2 = 'A';c2<='D';c2++){
	                for(char c3 = 'A';c3<='D';c3++){
	                    for(char c4 = 'A';c4<='D';c4++){
	                        if((c1 =='B' || c4 =='C') &&
	                           (c2 =='B' || c4 =='A') &&
	                           (c1 =='A' || c3 =='A') &&
	                           (c2 =='D' || c3 =='C')
	                            ){
	                                System.out.println(c1+" "+c2+" "+c3+" "+c4);
	                            }
	                    }
	                }
	            }
	        }
	        scan.close();
	    }

}

package Day49;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x = 0;
        reader.nextLine();
        while(n-->0){
            String line = reader.nextLine();
            if(line.contains("++")) {
            	x+=1;
            }else {
            	x-=1;
            }
        }
        System.out.println(x);

        reader.close();
    }
}

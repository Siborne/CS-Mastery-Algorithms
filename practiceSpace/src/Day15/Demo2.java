package Day15;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int bai = n/100;
        int shi = n/10%10;
        int ge = n%10;
        System.out.println(n+" = "+ge+" + "+ shi +"*10 + "+bai+"*100");
    }
}
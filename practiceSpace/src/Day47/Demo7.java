package Day47;

import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class Demo7 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str1 = scan.nextLine();
     String str2 = scan.nextLine();
     long ans = 0;
     for(int i = 0;i<str1.length();i++){
         if(str1.charAt(i)!=str2.charAt(i)){
             ans++;
         }
     }
     System.out.println(ans);
     scan.close();
 }
}
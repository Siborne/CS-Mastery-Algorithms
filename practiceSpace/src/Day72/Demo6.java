package Day72;

import java.util.*;

public class Demo6{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        long a = reader.nextInt();
        long b = reader.nextInt();
        long p = reader.nextInt();

        long s = quickPow(a,b,p)%p;
        System.out.println(a+"^"+b+" mod "+p+"="+s);
        reader.close();
    }

    private static long quickPow(long x,long y,long p){
        long res = 1L;
        while(y>0){
            if((y&1)==1){
                res*=x;    
                 res%=p;
            }
            x*=x;
            y>>=1;
        }
        return res;
    }
    
}

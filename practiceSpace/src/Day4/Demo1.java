package Day4;

import java.util.*;

public class Demo1{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();
        int t = reader.nextInt();
        int ans = 0;
        while(k-->0){
            int xi = reader.nextInt();
            int yi = reader.nextInt();

            if(xi<1||xi>n||yi<1||yi>m){
                continue;
            }

            int leftX = Math.max(1,xi-t);
            int rightX = Math.min(n,xi+t);
            
            for(int x = leftX;x<=rightX;x++){
                int dx = x - xi;
                int dxSq = dx*dx;
                if(dxSq>t*t){
                    continue;
                }
                int rem = t*t-dxSq;
                if(rem<0){
                    continue;
                }

                int dyMax = (int)Math.sqrt(rem);
                int minY = yi-dyMax;
                int maxY = yi+dyMax;
                int yLeft = Math.max(1,minY);
                int yRight = Math.min(n,maxY);

                if(yLeft>yRight){
                    continue;
                }

                ans+=yRight-yLeft+1;
                
            }
        }
        
        System.out.println(ans);
        reader.close();
        return;
    }
    
}
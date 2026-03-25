package Day18;

import java.math.BigInteger;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("651764141421415346185");
		int n = Integer.parseInt(String.valueOf(a.mod(new BigInteger("9"))));
        if(n==7){
            System.out.println((char)('A'+(n-1)));
        }
	}

}

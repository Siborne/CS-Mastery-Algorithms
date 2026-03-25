package Day14;


public class Demo1 {
	public static void main(String[] args) {
		long a = 7385137888721L;
        long b = 10470245;
        long c = a+b/4;
        long maxLen = 0;
        
        for(long L = 1;L*L<=c;L++) {
        	long need = L*L;
        	if(need<=c) {
        		maxLen = L*2;
        	}else {
        		break;
        	}
        }
        
        System.out.println(maxLen);
	}

}

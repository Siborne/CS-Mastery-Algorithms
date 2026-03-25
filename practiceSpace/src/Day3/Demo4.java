package Day3;

public class Demo4 {

	public static void main(String[] args) {
		 long a = 20250412;
	        long b = 20240413;

	        // 求最小满足 (N + a) % b == 0
	        long n = b - (a % b);
	        while ((n + b) % a != 0) {
	            n += b;
	        }
	        System.out.println(n);
	}

}

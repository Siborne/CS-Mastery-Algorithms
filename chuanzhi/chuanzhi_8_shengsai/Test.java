package chuanzhi_8_shengsai;

public class Test {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i <= (int)2e5-1; i++) {
			sum+= (long)1e5*(long)1e5;
		}
		System.out.println(sum);
	}
	
}

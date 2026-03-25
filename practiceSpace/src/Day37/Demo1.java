package Day37;

public class Demo1 {

	public static void main(String[] args) {
		for(long i = 1;i<=1000000007L;i++) {
			if((i*2021)%1000000007L==999999999) {
				System.out.println(i);
				return;
			}
		}
	}

}

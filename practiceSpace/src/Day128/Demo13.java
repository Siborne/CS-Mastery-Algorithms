package Day128;

public class Demo13 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 150; i++) {
			if (i%3!=2) {
				continue;
			}
			if (i%5!=3) {
				continue;
			}
			if (i%7==6) {
				break;
			}
		}
		System.out.println(i);
	}
	
}

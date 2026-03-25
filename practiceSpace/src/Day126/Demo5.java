package Day126;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			while (n-- > 0) {
				int AH = reader.nextInt();
				int AM = reader.nextInt();
				int AS = reader.nextInt();
				int BH = reader.nextInt();
				int BM = reader.nextInt();
				int BS = reader.nextInt();
				AS += BS;
				AM += AS / 60;
				AS %= 60;
				AM += BM;
				AH += AM / 60;
				AM %= 60;
				AH += BH;
				System.out.println(AH + " " + AM + " " + AS);
			}
		}

		reader.close();
	}

}

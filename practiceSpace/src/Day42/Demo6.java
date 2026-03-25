package Day42;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		long num1 = 0L;
		long num2 = 0L;
		boolean flag = false;
		int jz = 10;
		String state = null;
		while (n-- > 0) {
//			String op = reader.next();
			String[] line = reader.nextLine().split("\\s+");
			String op = line[0];
			if (op.equals("CLEAR")) {
				num1 = 0L;
				num2 = 0L;
				flag = false;
			} else if (op.equals("NUM")) {
				String num = line[1];
				if (!flag) {
					num1 = Long.parseLong(num, jz);
					flag = true;
				} else {
					num2 = Long.parseLong(num, jz);
					if (state.equals("ADD")) {
						num1 += num2;
					} else if (state.equals("SUB")) {
						num1 -= num2;
					} else if (state.equals("MUL")) {
						num1 *= num2;
					} else if (state.equals("DIV")) {
						num1 /= num2;
					} else if (state.equals("MOD")) {
						num1 %= num2;
					}
				}
			} else if (op.equals("CHANGE")) {
				jz = Integer.parseInt(line[1]);
			} else if (op.equals("EQUAL")) {
				System.out.println(Long.toString(num1, jz).toUpperCase());
//				System.out.println(Long.toString(num1, jz));
			} else {
				state = op;
			}
		}

		reader.close();
	}

}

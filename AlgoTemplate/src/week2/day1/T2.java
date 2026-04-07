package week2.day1;

public class T2 {

	public static void main(String[] args) {
		int res = 0;
		int[] bases = new int[] { 2, 4 };
		for (int i = 1; i <= 2024; i++) {
			String stringBase2 = convertToBase(i, bases[0]);
			String stringBase4 = convertToBase(i, bases[1]);
			if (getDigit(stringBase2) == getDigit(stringBase4)) {
				res++;
			}
		}
		System.out.println(res);
	}

	private static String convertToBase(int number, int base) {
		StringBuilder sb = new StringBuilder();
		while (number != 0) {
			sb.append(number % base);
			number /= base;
		}
		return sb.reverse().toString();
	}

	private static int getDigit(String s) {
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum += c - '0';
		}
		return sum;
	}

}

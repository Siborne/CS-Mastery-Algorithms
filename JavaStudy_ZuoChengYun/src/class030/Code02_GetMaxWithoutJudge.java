package class030;

public class Code02_GetMaxWithoutJudge {

	private static int filp(int n) {
		// TODO Auto-generated method stub
		return n ^ 1;
	}

	private static int sign(int n) {
		return filp(n >>> 31);
	}

	private static int getMax1(int a, int b) {
		int c = a - b;
		int returnA = sign(c);
		int returnB = filp(returnA);
		return a * returnA + b * returnB;
	}

	private static int getMax2(int a, int b) {
		int c = a - b;
		int signA = sign(a);
		int signB = sign(b);
		int signC = sign(c);
		int diffAB = signA ^ signB;
		int sameAB = filp(diffAB);
		int returnA = diffAB * signA + sameAB * signC;
		int returnB = filp(returnA);
		return a * returnA + b * returnB;
	}

}

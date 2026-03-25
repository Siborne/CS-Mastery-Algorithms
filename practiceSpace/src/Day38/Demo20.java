package Day38;

public class Demo20 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		long ans = 0L;
//		long temp = 1L;
//		for (long i = 1; i <= 202320232023L; i++) {
//			temp *= i;
//			temp %= 1000000000L;
//			ans += temp;
//			ans %= 1000000000L;
//		}
//		System.out.println(ans);
//	}

    public static void main(String[] args) {
        long ans = 0L;
        long factorial = 1L;

        for (int i = 1; i <= 39; i++) {
            factorial *= i;
            factorial %= 1000000000L; // 保留末尾 9 位
            ans = (ans + factorial) % 1000000000L;
        }

        System.out.printf("%09d\n", ans); // 保证输出 9 位，不足补前导 0
    }
    

}

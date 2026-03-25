package Day112;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 读取测试用例数量
		while (n-- > 0) {
			solve(scanner); // 处理每个测试用例
		}

	}

	public static void solve(Scanner scanner) {
		int x = scanner.nextInt(); // 读取当前测试用例的数字
		int sum = 1; // 初始化不拆分的权值和
		int splitSum = 0; // 初始化拆分的权值和
		// 遍历所有可能的质因数
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) { // 如果 i 是 x 的质因数
				int cnt = 0; // 初始化当前质因数的指数
				while (x % i == 0) { // 计算质因数 i 的指数
					x /= i;
					cnt++;
				}
				sum *= (cnt + 1); // 更新不拆分的权值和
				splitSum += 2 * cnt; // 更新拆分的权值和
			}
		}

		// 处理剩余的质数 如果 x > 1，说明 x 是一个质数
		if (x > 1) {
			sum *= 2; // 更新不拆分的权值和
			splitSum += 2; // 更新拆分的权值和
		}
		System.out.println(Math.max(splitSum, sum)); // 输出最大权值和
	}

}
package Day141;

public class Demo3 {
	public double average(int[] salary) {
		int maxSalary = salary[0];
		int minSalary = salary[0];
		double ans = 0;
		for (int s : salary) {
			maxSalary = Math.max(maxSalary, s);
			minSalary = Math.min(minSalary, s);
			ans += s;
		}
		ans -= maxSalary + minSalary;
		ans /= (salary.length - 2);
		return ans;
	}
}

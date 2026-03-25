package Day38;

import java.util.Arrays;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Student[] students = new Student[n];
		reader.nextLine();
		for (int i = 0; i < n; i++) {
			String[] data = reader.nextLine().split("\\s+");
			students[i] = new Student(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
		}
		reader.close();
		Arrays.sort(students);
		long ans = 0L;
		long preTime = 0L;
		for (Student student : students) {
			ans += student.s + student.a + preTime;
			preTime += student.sum;
		}
		System.out.println(ans);
	}

	private static class Student implements Comparable<Student> {

		public int s;
		public int a;
		public int e;
		public int sum;

		public Student(int s, int a, int e) {
			this.s = s;
			this.a = a;
			this.e = e;
			this.sum = s + a + e;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.sum - o.sum;
		}

	}

}

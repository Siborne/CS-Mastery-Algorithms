package Day114;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[][] students = new int[n][3];
		for (int i = 0; i < n; i++) {
			int chinese = reader.nextInt();
			int math = reader.nextInt();
			int english = reader.nextInt();
			int sum = chinese + math + english;
			students[i][0] = chinese;
			students[i][1] = sum;
			students[i][2] = i + 1;
		}

		Arrays.sort(students, (o1, o2) -> {
			if (o1[1] != o2[1]) {
				return Integer.compare(o2[1], o1[1]);
			} else if (o1[0] != o2[0]) {
				return Integer.compare(o2[0], o1[0]);
			} else {
				return Integer.compare(o1[2], o2[2]);
			}
		});
		int i = 0;
		for (int[] student : students) {
			if (i>=5) {
				break;
			}
			System.out.println(student[2] + " " + student[1]);
			i++;
		}

		reader.close();
	}

}

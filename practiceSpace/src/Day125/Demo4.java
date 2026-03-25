package Day125;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	private static class Student {
		int score;
		char team;

		private Student() {

		}

		private Student(int score, char team) {
			this.score = score;
			this.team = team;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			int score = reader.nextInt();
			char team = reader.next().charAt(0);
			Student stu = new Student(score, team);
			students[i] = stu;
		}

		int[][] scores = new int[k][k];

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				scores[i][j] = reader.nextInt();
			}
		}

		int[] projectScore = new int[k];

		for (int j = 0; j < k; j++) {
			double sum = 0;
			for (int i = 0; i < k; i++) {
				sum += scores[i][j];
			}
			double avg = sum / k;

			double newSum = 0;
			int validCount = 0;
			for (int i = 0; i < k; i++) {
				if (Math.abs(scores[i][j] - avg) <= 15) {
					newSum += scores[i][j];
					validCount++;
				}
			}
			projectScore[j] = (int) Math.round(newSum / validCount);
		}

		int xh = n / k;
		for (int i = 0; i < n; i++) {
			int teamIndex = students[i].team - 'A';
			students[i].score = (int) Math.round(students[i].score * 0.6 + projectScore[teamIndex] * 0.4);
		}

		Arrays.sort(students, (o1, o2) -> {
			if (o2.score != o1.score) {
				return Integer.compare(o2.score, o1.score);
			}
			return Character.compare(o1.team, o2.team);
		});
		for (Student s : students) {
			System.out.println(s.score + " " + s.team);
		}
		reader.close();
	}

}

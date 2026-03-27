package week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {

	private static class Student {
		String name;
		int score;

		private Student() {
		}

		private Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		Student[] students = new Student[n];

		for (int i = 0; i < n; i++) {
			String name = reader.next();
			int score = reader.nextInt();
			students[i] = new Student(name, score);
		}
		Arrays.sort(students, (a, b) -> {
			if (a.score != b.score) {
				return Integer.compare(b.score, a.score);
			}
			return a.name.compareTo(b.name);
		});

		for (Student s : students) {
			System.out.println(s.name + " " + s.score);
		}

		reader.close();
	}

}

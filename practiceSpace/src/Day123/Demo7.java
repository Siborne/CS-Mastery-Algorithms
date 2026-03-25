package Day123;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int score = reader.nextInt();
			if (score>100) {
				System.out.println("Score is error!");
			}else if (score>=90) {
				System.out.println("A");
			}else if(score>=80){
				System.out.println("B");
			}else if (score>=70) {
				System.out.println("C");
			}else if (score>=60) {
				System.out.println("D");
			}else if (score>=0) {
				System.out.println("E");
			}else {
				System.out.println("Score is error!");
			}
		}

		reader.close();
	}

}

package Day133;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextDouble()) {
			double x1 = reader.nextDouble();
			double y1 = reader.nextDouble();
			double x2 = reader.nextDouble();
			double y2 = reader.nextDouble();
			double x3 = reader.nextDouble();
			double y3 = reader.nextDouble();
			double x4 = reader.nextDouble();
			double y4 = reader.nextDouble();

			double rect1_x1 = Math.min(x1, x2);
			double rect1_x2 = Math.max(x1, x2);
			double rect1_y1 = Math.min(y1, y2);
			double rect1_y2 = Math.max(y1, y2);

			double rect2_x1 = Math.min(x3, x4);
			double rect2_x2 = Math.max(x3, x4);
			double rect2_y1 = Math.min(y3, y4);
			double rect2_y2 = Math.max(y3, y4);

			double overlapX1 = Math.max(rect1_x1, rect2_x1);
			double overlapX2 = Math.min(rect1_x2, rect2_x2);
			double overlapY1 = Math.max(rect1_y1, rect2_y1);
			double overlapY2 = Math.min(rect1_y2, rect2_y2);

			double area = 0.0;
			if (overlapX1 < overlapX2 && overlapY1 < overlapY2) {
				area = (overlapX2 - overlapX1) * (overlapY2 - overlapY1);
			}

			System.out.println(String.format("%.2f", area));
		}

		reader.close();
	}

}

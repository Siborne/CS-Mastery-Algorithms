package Day129;

public class Demo4 {

	public static void main(String[] args) {
		int cnt = 0;
		int hp = 2025;
		while (hp > 0) {
			hp -= 5;
			if ((cnt & 1) == 1) {
				hp -= 15;
			} else {
				hp -= 2;
			}
			if (cnt % 3 == 1) {
				hp -= 2;
			} else if (cnt % 3 == 2) {
				hp -= 10;
			} else {
				hp -= 7;
			}
			cnt++;
		}

		System.out.println(cnt);
	}

}

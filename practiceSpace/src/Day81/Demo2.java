package Day81;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String n = reader.nextLine();

		while (n.charAt(0) == '0') {
			n = n.substring(1);
		}
		int len = n.length()/2;
		for (int i = 0, j = n.length() - 1; i < len; i++, j--) {
			if(n.charAt(i)>n.charAt(j)) {
				int k = j - 1;
				while (k > 0 && n.charAt(k) == '0') {
					n = n.substring(0,k)+"9"+n.substring(k+1);
					k--;
				}
				char[] chs = n.toCharArray();
				chs[k]--;
				n = new String(chs);
				if(k==0&&n.charAt(k)=='0') {
					n = n.substring(0,j)+"9"+n.substring(j+1);
					n = n.substring(1);
					break;
				}
			}
			n = n.substring(0,j)+n.charAt(i)+n.substring(j+1);
		}

		System.out.println(n);
		reader.close();
	}

}

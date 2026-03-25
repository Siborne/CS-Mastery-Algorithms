package Day75;

import java.util.Scanner;

public class Demo36 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			char[] chs = reader.nextLine().toCharArray();
			int l = 0;
			int r = 0;
			long ans = 0;

			for (int i = 0; i < chs.length; i++) {
				char c = chs[i];
				if(c=='(') {
					if(r<=0) {
						l++;
					}else {
						ans+=r;
						r--;
					}
				}else if(c==')') {
					if(l>0) {
						l--;
					}else {
						r++;
					}
				}
				
				
			}

			System.out.println(ans);
		}

		reader.close();
	}

}

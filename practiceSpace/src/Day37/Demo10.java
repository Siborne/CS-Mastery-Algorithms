package Day37;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		Scanner reader = new Scanner(System.in);
		String num = reader.nextLine();
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			StringBuilder sb = new StringBuilder();
			if(num.length()==1) {
				sb.append(1).append(num);
			}else {
				int sum = 1;
				for(int j = 1;j<num.length();j++) {
					if(num.charAt(j)==num.charAt(j-1)) {
						sum++;
					}else {
						sb.append(sum).append(num.charAt(j-1));
						sum=1;
					}
				}
				sb.append(sum).append(num.charAt(num.length()-1));
			}
			num = sb.toString();
		}
		System.out.println(num);
		reader.close();
	}

}

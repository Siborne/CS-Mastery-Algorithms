package Day18;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		String[] str = reader.nextLine().split("\\s+");
		int ans = 0;
		for(int i = 0;i<n;i++) {
			if(str[i].equals("yuanxing")) {
				ans+=1;
			}else if(str[i].equals("zhengfangxing")) {
				ans+=2;
			}else if(str[i].equals("changfangxing")) {
				ans+=3;
			}else if(str[i].equals("sanjiaoxing")) {
				ans+=4;
			}else if(str[i].equals("tuoyuanxing")) {
				ans+=5;
			}else if(str[i].equals("liubianxing")) {
				ans+=6;
			}
		}
		System.out.println(ans);
	}

}

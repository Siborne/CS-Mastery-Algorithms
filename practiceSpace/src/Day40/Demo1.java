package Day40;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		String str1 = reader.nextLine();
		String str2 = reader.nextLine();
		
		List<String> list1 = splitWord(str1);
		List<String> list2 = splitWord(str2);
		
		int len = Math.max(list1.size(), list2.size());
		int[][] dp = new int[len+1][len+1];
		
		int ans = 0;
		for(int i = 1;i<=list1.size();i++) {
			for(int j = 1;j<=list2.size();j++) {
				if(list1.get(i-1).equals(list2.get(j-1))) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
				
				if(dp[i][j] > ans) {
					ans = dp[i][j];
				}
			}
		}
		
		System.out.println(ans);
		reader.close();
	}

	private static List<String> splitWord(String str){
		List<String> list = new ArrayList<>();
		
		int pre = 0;
		for(int i = 1;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				list.add(str.substring(pre,i));
				pre = i;
			}
		}
		
		list.add(str.substring(pre,str.length()));
		return list;
	}
	
}

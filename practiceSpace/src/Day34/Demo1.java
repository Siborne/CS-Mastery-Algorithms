package Day34;


import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean flag = false;
		while(reader.hasNextLine()) {
			char[] charArray = reader.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<charArray.length;i++) {
				if(charArray[i]=='"' && !flag) {
					sb.append("``");
					flag = true;
				}else if(charArray[i]=='"'&& flag){
					sb.append("''");
					flag = false;
				}else {
					sb.append(charArray[i]);
				}
			}
			System.out.println(sb.toString());
		}
	}

}

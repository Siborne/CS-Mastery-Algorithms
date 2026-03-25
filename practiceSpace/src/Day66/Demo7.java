package Day66;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.nextLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			st = new StringTokenizer(reader.nextLine());
			for(int i = 0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			boolean found = false;
			
			for(int i = 0;i<n&&!found;i++){
				int countK = 0;
				int maxOtherCount = 0;
				int[] freq = new int[101];
				
				for(int j = i;j<n;j++) {
					int current = arr[j];
					freq[current]++;
					if(current==k) {
						countK = freq[k];
					}else {
						maxOtherCount = Math.max(maxOtherCount, freq[current]);
					}
					if(countK>maxOtherCount) {
						found = true;
						break;
					}
				}
				
			}		
			
			System.out.println(found?"YES":"NO");
		}

		reader.close();
	}

}

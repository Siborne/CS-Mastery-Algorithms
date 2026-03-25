package Day3;

import java.util.*;

public class Demo2{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int x = reader.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0;i<n;i++){
//            arr[i] = reader.nextInt();
        	queue.add(reader.nextInt());
        }
        
        int ans = 0;
        
        while(true) {
        	int i = queue.poll();
        	int j = queue.poll();
        	int temp = i + j - x;
        	if(temp<=0) {
        		break;
        	}
        	ans+=temp;
        	i-=temp;
        	queue.add(i);
        	queue.add(j);
        }
        
        System.out.println(ans);
        reader.close();
        return;
    }
    
}

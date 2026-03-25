package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Demo8 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(reader.readLine());
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		int m = set.size();
		int l = 1;
		int r = n;
		while(l<r) {
			int mid = (l+r)>>1;
			if(check(mid,arr,m)) {
				r=mid;
			}else {
				l=mid+1;
			}
		}
		System.out.println(l);	
	}
	public static boolean check(int mid,int[] arr,int m){
		int n=arr.length;
		int[] f = new int[1001];
		int l = 0;
		int r = 0;
		int ans = 0;
		while(r<n) {
			f[arr[r]]++;
			if(f[arr[r]]==1) {
				ans++;
			}
			if(r-l+1>mid) {
				f[arr[l]]--;
				if(f[arr[l]]==0) {
					ans--;
				}
				l++;
			}
			r++;
			if(ans>=m) {
				return true;
			}
		}
		return false;
	}
}
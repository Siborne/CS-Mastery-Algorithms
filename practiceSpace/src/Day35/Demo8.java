package Day35;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<Integer.MAX_VALUE;i++) {
			int n = i;
			if(n%5==1&&n/5>=1) {
				n = n-1-n/5;
				if(n%5==2&&n/5>=1) {
					n=n-2-n/5;
					if(n%5==3&&n/5>=1) {
						n=n-3-n/5;
						if(n%5==4&&n/5>=1) {
							n = n-4-n/5;
							if(n%5==0&&n/5>=1) {
								System.out.println(i);
								break;
							}
						}
					}
				}
			}
		}
	}

}

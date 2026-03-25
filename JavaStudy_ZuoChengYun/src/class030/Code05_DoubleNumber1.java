package class030;

public class Code05_DoubleNumber1 {
	
	public int[] singleNumber(int[] nums) {
		int err1 = 0;
		for(int num:nums) {
			err1 ^= num;
		}
		
//		int rightOne = (err1)&(~err1+1);
		int rightOne = (err1)&(-err1);
		int err2 = 0;
		for(int num:nums) {
			if((num&rightOne)==0) {
				err2^=num;
			}
		}
		return new int[] {err2,err1^err2};
    }
	
}

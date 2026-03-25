package Day141;

public class Demo2 {

	public int countOdds(int low, int high) {
		if ((low & 1) == 0 && (high & 1) == 0) {
			return (high - low) >> 1;
		} else if ((low & 1) == 1 && (high & 1) == 1) {
			return ((high - low) >> 1) + 1;
		} else {
			return ((high - low) >> 1) + 1;
		}
	}
}

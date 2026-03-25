package class060;

public class Code04_MaximumEmployeesToBeInvitedToAMeeting {

	public int maximumInvitations(int[] favorite) {
		int n = favorite.length;
		int[] indegree = new int[n];
		for (int i = 0; i < n; i++) {
			indegree[favorite[i]]++;
		}
		int[] queue = new int[n];
		int l = 0;
		int r = 0;
		for (int i = 0; i < n; i++) {
			if (indegree[i] == 0) {
				queue[r++] = i;
			}
		}
		int[] deep = new int[n];
		while (l < r) {
			int cur = queue[l++];
			int next = favorite[cur];
			deep[next] = Math.max(deep[next], deep[cur] + 1);
			if (--indegree[next] == 0) {
				queue[r++] = next;
			}
		}
		int sumOfSmallRings = 0;
		int bigRings = 0;
		for (int i = 0; i < n; i++) {
			if (indegree[i] > 0) {
				int ringSize = 1;
				indegree[i] = 0;
				for (int j = favorite[i]; j != i; j = favorite[j]) {
					ringSize++;
					indegree[j] = 0;
				}
				if (ringSize == 2) {
					sumOfSmallRings += 2 + deep[i] + deep[favorite[i]];
				} else {
					bigRings = Math.max(bigRings, ringSize);
				}
			}
		}
		return Math.max(sumOfSmallRings, bigRings);
	}

}

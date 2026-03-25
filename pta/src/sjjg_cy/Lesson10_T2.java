package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class UserInfo {
	int id;
	int totalScore;
	int perfectCount;
	int[] scores;
}

public class Lesson10_T2 {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		// 使用更快的输入输出方式

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] fullScores = new int[K];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < K; i++) {
			fullScores[i] = Integer.parseInt(st.nextToken());
		}

		// 使用数组而不是ArrayList
		UserInfo[] users = new UserInfo[N];
		int[][] userScores = new int[N][K];
		boolean[] valid = new boolean[N];

		// 初始化用户分数数组
		for (int i = 0; i < N; i++) {
			Arrays.fill(userScores[i], -1);
		}

		// 处理提交记录
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(reader.readLine());
			int userId = Integer.parseInt(st.nextToken()) - 1;
			int problemId = Integer.parseInt(st.nextToken()) - 1;
			int score = Integer.parseInt(st.nextToken());

			if (score >= 0) {
				valid[userId] = true;
				if (score > userScores[userId][problemId]) {
					userScores[userId][problemId] = score;
				}
			} else {
				if (userScores[userId][problemId] == -1) {
					userScores[userId][problemId] = 0;
				}
			}
		}

		// 计算有效用户的数量
		int validCount = 0;
		for (int i = 0; i < N; i++) {
			if (valid[i]) {
				validCount++;
				users[i] = new UserInfo();
				users[i].id = i;
				users[i].scores = userScores[i];

				int total = 0;
				int perfect = 0;
				for (int j = 0; j < K; j++) {
					if (userScores[i][j] >= 0) {
						total += userScores[i][j];
						if (userScores[i][j] == fullScores[j]) {
							perfect++;
						}
					}
				}
				users[i].totalScore = total;
				users[i].perfectCount = perfect;
			}
		}

		// 创建有效用户数组
		UserInfo[] validUsers = new UserInfo[validCount];
		int index = 0;
		for (int i = 0; i < N; i++) {
			if (valid[i]) {
				validUsers[index++] = users[i];
			}
		}

		// 排序有效用户
		Arrays.sort(validUsers, new Comparator<UserInfo>() {
			@Override
			public int compare(UserInfo a, UserInfo b) {
				if (a.totalScore != b.totalScore) {
					return b.totalScore - a.totalScore;
				}
				if (a.perfectCount != b.perfectCount) {
					return b.perfectCount - a.perfectCount;
				}
				return a.id - b.id;
			}
		});

		// 输出结果
		int rank = 1;
		for (int i = 0; i < validCount; i++) {
			if (i > 0 && validUsers[i].totalScore != validUsers[i - 1].totalScore) {
				rank = i + 1;
			}

			// 使用StringBuilder构建输出字符串
			StringBuilder sb = new StringBuilder();
			sb.append(rank).append(" ").append(String.format("%05d", validUsers[i].id + 1)).append(" ")
					.append(validUsers[i].totalScore);

			for (int j = 0; j < K; j++) {
				if (validUsers[i].scores[j] == -1) {
					sb.append(" -");
				} else {
					sb.append(" ").append(validUsers[i].scores[j]);
				}
			}

			writer.println(sb.toString());
		}

		writer.flush();
	}

}

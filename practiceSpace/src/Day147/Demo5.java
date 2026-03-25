package Day147;

import java.util.*;

public class Demo5 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int q = sc.nextInt();
        int L = sc.nextInt();

        long[][] C = new long[n][L];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < L; j++) {
                C[i][j] = sc.nextLong();
            }
        }

        long[] d = new long[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextLong();
        }

        sc.nextLine(); // skip newline
        List<String> ops = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) ops.add(line);
        }

        // Game state
        int[] pos = {0, 0};
        long[] money = {m, m};
        int[] owner = new int[n];
        int[] level = new int[n];
        long[] a = new long[n];
        Arrays.fill(owner, -1);

        int moveCount = 0;
        int idx = 0;
        int totalMoves = 2 * q;

        while (moveCount < totalMoves && idx < ops.size()) {
            String[] parts = ops.get(idx).split("\\s+");
            idx++;
            int op = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            if (op != 1) continue; // should not happen

            int player = moveCount % 2;
            int start = pos[player];
            // Move k steps
            for (int step = 1; step <= k; step++) {
                int cell = (start + step) % n;
                if (owner[cell] == player) {
                    money[player] += a[cell];
                } else if (owner[cell] == 1 - player) {
                    money[player] -= a[cell];
                    money[1 - player] += a[cell];
                }
                if (money[player] < 0) {
                    System.out.println(player == 0 ? "Renko" : "Merry");
                    return;
                }
            }
            pos[player] = (start + k) % n;
            moveCount++;

            // Check next op is "2"
            if (idx < ops.size()) {
                String[] nextParts = ops.get(idx).split("\\s+");
                if (nextParts.length >= 2 && Integer.parseInt(nextParts[0]) == 2) {
                    int upgradeTimes = Integer.parseInt(nextParts[1]);
                    idx++; // consume it
                    int cell = pos[player];
                    if (owner[cell] != 1 - player) {
                        int times = upgradeTimes;
                        // Build if not exists
                        if (owner[cell] == -1) {
                            if (times > 0 && money[player] >= C[cell][0]) {
                                money[player] -= C[cell][0];
                                owner[cell] = player;
                                level[cell] = 1;
                                a[cell] = C[cell][0];
                                times--;
                                if (money[player] < 0) {
                                    System.out.println(player == 0 ? "Renko" : "Merry");
                                    return;
                                }
                            } else {
                                times = 0;
                            }
                        }
                        // Upgrade
                        while (times > 0 && level[cell] < L) {
                            long cost = C[cell][level[cell]];
                            if (money[player] >= cost) {
                                money[player] -= cost;
                                a[cell] += cost;
                                level[cell]++;
                                times--;
                                if (money[player] < 0) {
                                    System.out.println(player == 0 ? "Renko" : "Merry");
                                    return;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }

            // End of round?
            if (moveCount % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (owner[i] != -1) {
                        money[owner[i]] += d[i];
                    }
                }
                if (money[0] < 0) {
                    System.out.println("Renko");
                    return;
                }
                if (money[1] < 0) {
                    System.out.println("Merry");
                    return;
                }
            }
        }

        System.out.println(money[0] + " " + money[1]);
    }
    
}
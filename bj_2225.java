import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2225 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int k = Integer.parseInt(inputs[0]);

    int[][] dp = new int[201][201];

    for (int i = 1; i <= k; i++) {
      dp[i][0] = 1;
    }

    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % 1_000_000_000;
      }
    }

    System.out.println(dp[k][n]);
  }
}

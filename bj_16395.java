import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_16395 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int row = Integer.parseInt(input[0]);
    int column = Integer.parseInt(input[1]);

    int[][] dp = new int[row + 1][row + 1];

    dp[1][1] = 1;

    for (int i = 2; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
      }
    }

    System.out.println(dp[row][column]);
  }
}

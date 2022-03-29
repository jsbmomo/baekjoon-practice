import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj_11727 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tile = Integer.parseInt(br.readLine());

    int[] dp = new int[1001];
    dp[1] = 1;
    dp[2] = 3;

    for (int i = 3; i <= tile; i++) {
      dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
    }

    System.out.println(dp[tile]);
  } 
}

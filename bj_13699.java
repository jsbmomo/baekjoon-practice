import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13699 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());

    long[] dp = new long[36];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i < 36; i++) {
      for (int j = 0; j < i; j++) {
        dp[i] += (dp[j] * dp[i - 1 - j]);
      }
    }

    System.out.println(dp[input]);
    
    br.close();
  }
}

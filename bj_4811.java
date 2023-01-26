import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_4811 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    long count = 0;
    long[] dp = new long[31];
    int n;

    dp[0] = 1;
    dp[1] = 1;
    dp[1] = 2;

    while (true) {
      n = Integer.parseInt(br.readLine());

      if (n == 0) {
        break;
      } else {
        for (int i = 3; i <= 30; i++) {
          count = 0;
          for (int j = 0; j < i; j++) {
            count += dp[j] * dp[i - 1 - j];
          }
          dp[i] = count;
        }

        System.out.println(dp[n]);
      }
    }
    
    br.close();
  }
}

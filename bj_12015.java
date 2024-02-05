import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_12015 {

  static int[] nums;
  static int count;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    int result = 0;
    int[] dp = new int[count];

    for (int i = 0; i < count; i++) {
      for (int j = i + 1; j < count; j++) {
        if (nums[i] < nums[j]) Math.max(dp[j], dp[j - 1]);
      }
    }

    for (int i = 0; i < count; i++) {
      if (result < dp[i]) result = dp[i];
    }

    System.out.println(result);
  }

  static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    count = Integer.parseInt(br.readLine());
    nums = new int[count];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; st.hasMoreTokens(); i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }
}
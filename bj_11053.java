import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_11053 {

  static int len, result;
  static int[] A;
  static int[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    len = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = new int[len];

    for (int i = len - 1; i >= 0; i--) {
      A[i] = Integer.parseInt(st.nextToken());
      dp[i] = 1;
    }

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (A[i] < A[j]) {
          dp[j] = Math.max(dp[j], dp[i] + 1);
        }
      }
    }

    for (int i = 0; i < len; i++) {
      if (result < dp[i]) result = dp[i];
    }

    System.out.println(result);
    br.close();
  }

}

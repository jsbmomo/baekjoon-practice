import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11722 {
  static BufferedReader br;
  static int count;
  static int[] ary;
  static int[] dp;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    count = Integer.parseInt(br.readLine());
    ary = new int[count];
    dp = new int[count];
    
    int cycle = 0;
    for (String st : br.readLine().split(" ")) {
      ary[cycle++] = Integer.parseInt(st);
    }

    for (int i = 2; i < count; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (ary[i] < ary[j] && dp[i] <= dp[j]) {
          dp[i] = dp[j] + 1;
        } else if(ary[i] == ary[j]) {
          dp[i] = dp[j];
        }
      }
    }

    int result = dp[0];

    for (int i = 1; i < count; i++) {
      System.out.println(dp[i]);
      result = Math.max(dp[i], result);
    }
    
    System.out.println(result);

    br.close();
  }
}

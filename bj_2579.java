import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2579 {

	static int[] dp;
	static int[] ary;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    dp = new int[count + 1];
    ary = new int[count + 1];

    for (int i = 0; i < count; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }
    
    dp[0] = ary[0];
    dp[1] = ary[1];

    if (count >= 2) {
      dp[2] = ary[1] + ary[2];
    }
    
    System.out.println(find(count));

    br.close();
  }

  private static int find(int n) {
    if (dp[n] == null) dp[n] = Math.max(find(n - 2), find(n - 3) + ary[n - 1]) + ary[n];

    return dp[n];
  }
}

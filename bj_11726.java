import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 출력 : 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */
public class bj_11726 {

  static int[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tileWidth = Integer.parseInt(br.readLine());

    if (tileWidth < 3) {
      System.out.println(tileWidth);
      return;
    }

    dp = new int[tileWidth];
    dp[0] = 1;
    dp[1] = 2;

    for (int idx = 2; idx < tileWidth; idx++) {
      dp[idx] = (dp[idx - 1] + dp[idx - 2]) % 10007;
    }
    
    System.out.println(dp[tileWidth - 1] % 10007);
  }  
}

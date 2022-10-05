import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1932 {
  static BufferedReader br;
  static StringTokenizer st;
  static int line;
  static int[][] triangle;
  static Integer[][] dp; // 새로운 배열을 통해 max 값 계산
  static int max = 0;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    line = Integer.parseInt(br.readLine());
    triangle = new int[line][line];
    dp = new Integer[line][line];

    for (int i = 0; i < line; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < i + 1; j++) {
        triangle[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 가장 마지막 행 복사
    for (int i = 0; i < line; i++) {
      dp[line - 1][i] = triangle[line - 1][i];
    }
    
    System.out.println(findMaxValue(0, 0));

    br.close();
  }

  static int findMaxValue(int depth, int index) {
    // 마지막 행일 경우 현재 위치의 dp값 반환
    if (depth == line - 1) return dp[depth][index];

    // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
    if (dp[depth][index] == null) {
      dp[depth][index] = Math.max(
          findMaxValue(depth + 1, index), 
          findMaxValue(depth + 1, index + 1)
        ) + triangle[depth][index];
    }

    return dp[depth][index];
  }
}

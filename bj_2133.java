import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2133 {

  static int[] tile = new int[1001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    System.out.println(dp(count));
  }

  public static int dp(int count) {
    if (count == 0) return 1;
    if (count == 1) return 0;
    if (count == 2) return 3;
    if (tile[count] != 0) return tile[count];
    int result = 3 * dp(count - 2);

    for (int i = 3; i <= count; i++) {
      if (i % 2 == 0) {
        result += 2 * tile[count - i];
      }
    }

    return tile[count] = result;
  }
}

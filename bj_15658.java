import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_15658 {

  static int N;
  static int[] nums;
  static int[] oper;
  static int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  private static void solution() {
    dfs(1, nums[0]);

    System.out.println(max);
    System.out.println(min);
  }

  private static void dfs(int count, int value) {
    if (value == N) {
      max = Math.max(value, max);
      min = Math.min(value, min);
      return ;
    }

    for (int i = 0; i < 4; i++) {
      if (oper[i] > 0) {
        oper[i] -= 1;

        switch (i) {
          case 0:
            dfs(count + 1, value + nums[count]);
            break;
          case 1:
            dfs(count + 1, value - nums[count]);
            break;
          case 2:
            dfs(count + 1, value * nums[count]);
            break;
          case 3:
            dfs(count + 1, value / nums[count]);
            break;
        }

        oper[i] += 1;
      }
    }
  }

  private static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    nums = new int[N];

    for (int i = 0; i < N; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    oper = new int[4];

    for (int i = 0; i < N; i++) {
      oper[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }
}

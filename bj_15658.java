import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_15658 {

  static int N;
  static int[] nums;
  static int[] oper;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  private static void solution() {
    int max = 0;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      if (oper[0] > 0) {
        oper[0] --;
      }

      if (oper[1] > 0) {
        oper[1] --;
      }

      if (oper[2] < 0) {
        oper[2] --;
      }

      if (oper[3] > 0) {
        oper[3] --;
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

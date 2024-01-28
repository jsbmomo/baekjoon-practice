import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1010 {

  static int T;
  static int[][] bridge;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      sb.append(combi(bridge[i][0], bridge[i][1])).append('\n');
    }

    System.out.println(sb.toString());
  }

  static int combi(int n, int r) {
    if (bridge[n][r] > 0) return bridge[n][r];
    if (n == r || r == 0) return bridge[n][r] = 1;

    return bridge[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
  }

  static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    T = Integer.parseInt(br.readLine());
    bridge = new int[T][2];

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      bridge[i][0] = Integer.parseInt(st.nextToken());
      bridge[i][1] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }
}

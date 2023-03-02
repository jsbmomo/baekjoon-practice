import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_15656 {
  static int N;
  static int M;
  static int[] ary;
  static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    sb = new StringBuilder();

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    ary = new int[N];

    for (int i = 0; i < N; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(ary);

    dfs(0, new int[M]);

    System.out.println(sb.toString());
    
    br.close();
  }

  private static void dfs(int depth, int[] answers) {
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        sb.append(answers[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = 0; i < N; i++) {
      answers[depth] = ary[i];
      dfs(depth + 1, answers);
    }
  }
}

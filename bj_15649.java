import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class bj_15649 {

  public static int[] ary;
  public static boolean[] visit;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();

    ary = new int[m];
    visit = new boolean[n];

    dfs(n, m, 0);

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    sc.close();
  }

  public static void dfs(int N, int M, int depth) {
    if (depth == M) {
      for (int val : ary) {
        sb.append(val).append(' ');
      }
      sb.append('\n');
      return ;
    }

    for (int i = 0; i < N; i++) {
      if (!visit[i]) {
        visit[i] = true;
        ary[depth] = i + 1;
        dfs(N, M, depth + 1);
        visit[i] = false;
      }
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 10451 순열 사이클 
 * 
 * Reference : https://loosie.tistory.com/207
 */
public class bj_10451 {
  static BufferedReader br = null;
  static StringBuilder result = null;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    result = new StringBuilder();
    
    final int testCase = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCase; i++) {
      solustion();
    }

    System.out.print(result.toString());
    br.close();
  }

  static int T;
  static int[] N;
  static int cycle;
  static boolean[] visit;

  static void solustion() throws IOException {
    T = Integer.parseInt(br.readLine());
    N = new int[T];
    cycle = 0;
    visit = new boolean[T];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < T; i++) {
      N[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < T; i++) {
      if (!visit[i]) {
        dfs(i);
        cycle++;
      }
    }

    result.append(cycle).append("\n");
  }

  static void dfs(int index) {
    visit[index] = true;

    int next = N[index];

    if (!visit[next]) {
      dfs(next);
    }
  }
}

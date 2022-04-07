import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11724 {
  
  static int[][] graph = new int[1001][1001];
  static int v;
  static int e;
  static boolean[] visited = new boolean[1001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    v = Integer.parseInt(br.readLine());
    e = Integer.parseInt(br.readLine());

    int a, b;

    for (int i = 0; i < e; i++) {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());

      graph[a][b] = graph[b][a] = 1;
    }

    int result = 0;

    for (int i = 1; i <= v; i++) {
      if (visited[i] == false) {
        dfs(i);
        result++;
      }
    }

    System.out.println(result);

    return;
  }


  public static void dfs(int index) {
    if (visited[index] == true) {
      return;
    } else {
      visited[index] = true;
      for (int i = 1; i <= v; i++) {
        if (graph[index][i] == 1) {
          dfs(i);
        }
      }
    }
  }
}

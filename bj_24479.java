import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class bj_24479 {

  static int N, M, R;
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] visited;
  static int count = 1;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    for (int i = 1; i <= N; i++) {
      Collections.sort(graph.get(i));
    }

    dfs(R);

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < visited.length; i++) {
      sb.append(visited[i]).append("\n");
    }

    System.out.println(sb.toString());
  }

  static void dfs(int node) {
    visited[node] = count;

    for (int i = 0; i < graph.get(node).size(); i++) {
      int newNode = graph.get(node).get(i);

      if (visited[newNode] == 0) {
        count++;
        dfs(newNode);
      }
    }
  }

  static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());

    visited = new int[N + 1];

    for (int i = 0; i <= N; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
  
      int U = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
  
      graph.get(U).add(V);
      graph.get(V).add(U);
    }

    br.close();
  }

}

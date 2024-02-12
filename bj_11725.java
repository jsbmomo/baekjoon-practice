import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_11725 {

  static int nodes;
  static ArrayList<Integer>[] tree;
  static boolean[] visited;
  static int[] parent;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    nodes = Integer.parseInt(br.readLine());
    tree = new ArrayList[nodes + 1];
    visited = new boolean[nodes + 1];

    parent = new int[nodes + 1];

    for (int i = 0; i < nodes + 1; i++) {
      tree[i] = new ArrayList<>();
    }

    for (int i = 1; i <= nodes; i++) {
      st = new StringTokenizer(br.readLine());

      int n1 = Integer.parseInt(st.nextToken());
      int n2 = Integer.parseInt(st.nextToken());

      tree[n1].add(n2);
      tree[n2].add(n1);
    }

    dfs(1); // root

    StringBuilder sb = new StringBuilder();

    for (int i = 2; i < parent.length; i++) {
      sb.append(parent[i]).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }

  static void dfs(int index) {
    visited[index] = true;

    for (int i : tree[index]) {
      if (!visited[i]) {
        parent[i] = index;
        dfs(i);
      }
    }
  }

}

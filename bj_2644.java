import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2644 {

  static BufferedReader br = null;
  static StringTokenizer st = null;
  static int person, start, end, count;

  static int[][] graph;
  static boolean[] visited;
  static int result = -1;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));

    person = Integer.parseInt(br.readLine());
    
    st = new StringTokenizer(br.readLine());;
    start = Integer.parseInt(st.nextToken());
    end = Integer.parseInt(st.nextToken());

    count = Integer.parseInt(br.readLine());

    graph = new int[count + 1][2];
    visited = new boolean[person + 1];
  
    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      graph[i][0] = x;
      graph[i][1] = y;
    }

    solution(start, end, 0);

    System.out.println(result);

    br.close();
  }

  static void solution(int start, int end, int depth) {
    if (start == end) {
      result = depth;
      return ;
    }

    visited[start] = true;

    for (int i = 0; i < graph[start].length; i++) {
      int next = graph[start][i];
      if (!visited[next]) solution(next, end, depth + 1);
    }
  }
}
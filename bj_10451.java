import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10451 {
  static int[] map;
  static boolean[] check;
  static int cycle;

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int counter = Integer.parseInt(br.readLine());

    for (int test = 0; test < counter; test++) {
      int num = Integer.parseInt(br.readLine());
      map = new int[num + 1];
      cycle = 0;

      st = new StringTokenizer(br.readLine());

      for (int i = 1; i < num + 1; i++ ){
        map[i] = Integer.parseInt(st.nextToken());
      }

      check = new boolean[num + 1];

      for (int i = 1; i < num + 1; i++) {
        if (!check[i]) {
          customDFS(i);
          cycle++;
        }
      }

      System.out.println(cycle);
    }
  }

  static void customDFS(int start) {
    check[start] = true;

    int next = map[start];

    if (!check[next]) {
      customDFS(map[start]);
    }
  }
}

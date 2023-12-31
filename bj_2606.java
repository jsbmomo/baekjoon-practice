import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2606 {
  static int pcCount;
  static int connected;
  static int result = 0;
  static int[][] pc;
  static boolean[] infected;
  static final int VIRUS = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    pcCount = Integer.parseInt(br.readLine());
    connected = Integer.parseInt(br.readLine());

    pc = new int[pcCount + 1][pcCount + 1];
    infected = new boolean[pcCount + 1];

    for (int i = 1; i <= connected; i++) {
      String[] str = br.readLine().split(" ");
      int y = Integer.parseInt(str[0]);
      int x = Integer.parseInt(str[1]);

      pc[y][x] = pc[x][y] = 1;
    }

    dfs(VIRUS);

    System.out.println(result);
    br.close();
  }

  static void dfs(int pcName) {
    infected[pcName] = true;

    for (int i = 1; i <= pcCount; i++) {
      if (pc[pcName][i] == 1 && !infected[i]) {
        dfs(i);
        result++;
      }
    }
  }
}

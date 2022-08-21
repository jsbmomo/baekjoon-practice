import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1987 {

  static int r, c, result;
  static char[][] board;
  static int[] dr = { -1, 0, 1, 0 };
  static int[] dc = { -1, 0, 1, 0 };
  static boolean[][] visit;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    board = new char[r][c];

    for (int i = 0; i < r; i++) {
      String str = br.readLine();
      for (int j = 0; j < c; j++) {
        board[i][j] = str.charAt(j);
      }
    }

    visit = new boolean[r][c];

    result = 1;

    dfs(0, 0, board[0][0] + "");

    System.out.println(result);
    br.close();
  }

  static void dfs(int r, int c, String str) {
    visit[r][c] = true;
    
    for (int i = 0; i < 4; i++) {
      int nr = r * dr[i];
      int nc = r * dc[i];

      if (0 <= nr && nr < r && 0 <= nc && nc < c && !visit[nr][nc])
    }
  }
}

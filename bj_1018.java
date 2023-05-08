import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1018 {
  static boolean[][] board;
  static int min = 64;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    board = new boolean[M][N];

    for (int i = 0; i < M; i++) {
      String input = br.readLine();

      for (int j = 0; j < N; j++) {
        if (input.charAt(j) == 'W') {
          board[i][j] = true;
        } else {
          board[i][j] = false;
        }
      }
    }

    int N_row = N - 7;
    int M_col = M - 7;

    for (int i = 0; i < N_row; i++) {
      for (int j = 0; j < M_col; j++) {
        find(i, j);
      }
    }

    System.out.println(min);
    br.close();
  }

  static void find(int x, int y) {
    int end_x = x + 8;
    int end_y = y + 8;
    int count = 0;

    boolean tf = board[x][y];

    for (int i = x; i < end_x; i++) {
      for (int j = y; j < end_y; j++) {
        if (board[i][j] != tf) {
          count++;
        }

        tf = !tf;
      }

      tf = !tf;
    }

    count = Math.min(count, 64 - count);
    min = Math.min(min, count);
  }
}

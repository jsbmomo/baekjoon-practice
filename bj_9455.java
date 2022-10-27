import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_9455 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int test = Integer.parseInt(br.readLine());

    int row = 0;
    int column = 0;
    int[][] grid;
    StringTokenizer st;

    for (int i = 0; i < test; i++) {
      String[] input = br.readLine().split(" ");
      row = Integer.parseInt(input[0]);
      column = Integer.parseInt(input[1]);

      grid = new int[row][column];

      int len = 0;
      for (int r = 0; r < row; r++) {
        st = new StringTokenizer(br.readLine());
        len = st.countTokens();
        for (int t = 0; t < len; t++) {
          grid[r][t] = Integer.parseInt(st.nextToken());
        }
      }

      int move = 0;
      for (int c = 0; c < column; c++) {
        for (int r = 0; r < row; r++) {
          if (grid[r][c] != 1) {
            continue;
          }

          for (int n = r + 1; n < row; n++) {
            if (grid[n][c] == 0) {
              move++;
            }
          }
        }
      }

      bw.append(move + "\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}

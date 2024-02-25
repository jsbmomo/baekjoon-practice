import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2447 {

  static char[][] ary;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());

    ary = new char[input][input];

    star(0, 0, input, false);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input; i++) {
      for (int j = 0; j < input; j++) {
        sb.append(ary[i][j]);
      }
      sb.append('\n');
    }

    System.out.println(sb);
  }

  private static void star(int x, int y, int n, boolean blank) {
    if (blank) {
      for (int i = x; i < x + n; i++) {
        for (int j = y; j < y + n; j++) {
          ary[i][j] = ' ';
        }
      }
      return;
    }

    if (n == 1) {
      ary[x][y] = '*';
      return;
    }

    int size = n / 3;
    int count = 0;

    for (int i = x; i < x + n; i += size) {
      for (int j = y; j < y + n; j += size) {
        count++;

        if (count == 5) {
          star(i, j, size, true);
        } else {
          star(i, j, size, false);
        }
      }
    }
  }
}

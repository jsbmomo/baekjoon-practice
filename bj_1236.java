import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1236 {
  static BufferedReader br;
  static StringTokenizer st;
  static int row;
  static int col;
  static char[][] data;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());

    userInputs();

    System.out.println(checkNeedToGuard());
  }

  static void userInputs() throws IOException {
    row = Integer.parseInt(st.nextToken());
    col = Integer.parseInt(st.nextToken());

    data = new char[row][col];

    for (int i = 0; i < row; i++) {
      data[i] = br.readLine().toCharArray();
    }
  }

  static int checkNeedToGuard() {
    int needCol = 0;
    int needRow = 0;

    for (int i = 0; i < row; i++) {
      boolean exist = false;

      for (int j = 0; j < col; j++) {
        if (data[i][j] == 'X') {
          exist = true;
          break;
        }
      }

      if (!exist) needCol += 1;
    }

    for (int  i = 0; i < col; i++) {
      boolean exist = false;

      for (int j = 0; j < row; j++) {
        if (data[j][i] == 'X') {
          exist = true;
          break;
        }
      }

      if (!exist) needRow += 1;
    }

    return Math.max(needCol, needRow);
  }
}

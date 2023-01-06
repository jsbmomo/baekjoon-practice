import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_2738 {
  static BufferedReader br;
  static BufferedWriter bw;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[][] aryFirst = getMatrixArrays(N, M);
    int[][] arySecond = getMatrixArrays(N, M);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(aryFirst[i][j] + arySecond[i][j]).append(" ");
      }
      sb.append("\n");
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  private static int[][] getMatrixArrays(int rows, int columns) throws IOException {
    int[][] matrix = new int[rows][columns];

    for (int[] row : matrix) {
      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < columns; i++) {
        row[i] = Integer.parseInt(st.nextToken());
      }
    }

    return matrix;
  }
}

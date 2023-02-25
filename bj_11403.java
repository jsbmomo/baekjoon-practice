import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11403 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    int[][] matrix = new int[count][count];

    for (int[] m : matrix) {
      String[] inputs = br.readLine().split(" ");

      for (int i = 0; i < inputs.length; i++) {
        m[i] = Integer.parseInt(inputs[i]);
      }
    }

    for (int i = 0; i < count; i++) {
      for (int j = 0; j < count; j++) {
        for (int k = 0; k < count; k++) {
          if (matrix[j][i] == 0 && matrix[i][k] == 1) {
            matrix[j][k] = 1;
          }
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      for (int j = 0; j < count; j++) {
        sb.append(matrix[i][j]).append(" ");
      }
      sb.append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}

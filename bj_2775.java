import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2775 {
  public static void main(String[] args) throws IOException {
    int[][] apt = new int[15][15];

    for (int i = 0; i < 15; i++) { // 초기화
      for (int j = 1; j < 15; j++) {
        apt[j][1] = 1;
        apt[0][j] = j;
      }
    }

    for (int i = 1; i < 15; i++) { // Data set
      for (int j = 2; j < 15; j++) {
        apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
      }
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int testCase = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCase; i++) {
      int floor = Integer.parseInt(br.readLine());
      int room = Integer.parseInt(br.readLine());

      sb.append(apt[floor][room]).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}

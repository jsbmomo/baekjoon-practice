import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_9076 {

  static StringTokenizer inputs = null;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int testCase = Integer.parseInt(br.readLine());

    int[][] num = new int[testCase][5];

    for (int i = 0; i < testCase; i++) {
      inputs = new StringTokenizer(br.readLine());

      for (int j = 0; j < 5; j++) {
        num[i][j] = Integer.parseInt(inputs.nextToken());
      }
    }

    for (int i = 0; i < testCase; i++) {
      Arrays.sort(num[i]);
    }

    for (int i = 0; i < testCase; i++) {
      if (num[i][3] - num[i][1] >= 4) {
        sb.append("KIN");
      } else {
        sb.append(num[i][1] + num[i][2] + num[i][3]);
      }

      sb.append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}

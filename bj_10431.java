import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10431 {
  static int testCase;
  static int[][] line;
  static final int person = 20;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    testCase = Integer.parseInt(br.readLine());
    line = new int[testCase][person + 1];

    StringTokenizer st = null;

    for (int i = 0; i < testCase; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; st.hasMoreTokens(); j++) {
        line[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < testCase; i++) {
      int move = 0;
      int max = person;

      for (int j = person - 1; j > 0; j--) {
        if (line[i][j] > line[i][max]) {
          int temp = line[i][j];
          line[i][j] = line[i][max];
          line[i][max] = temp;

          max = j;
          move++;
        }
      }

      sb.append(line[i][0]).append(" ").append(move).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}

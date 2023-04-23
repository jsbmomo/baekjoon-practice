import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2566 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int value = 0;
    int row = 0;
    int column = 0;
    
    for (int i = 0; i < 9; i++) {
      st = new StringTokenizer(br.readLine());

      for (int j = 0; st.hasMoreTokens(); j++) {
        int num = Integer.parseInt(st.nextToken());

        if (num >= value) {
          value = num;
          row = i + 1;
          column = j + 1;
        }
      }
    }

    System.out.printf("%d\n%d %d\n", value, row, column);
    br.close();
  }
}

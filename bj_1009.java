import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int T = Integer.parseInt(br.readLine());

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int result = 1;

      for (int j = 0; j < b; j++) {
        result = (result * a) % 10;
      }

      if (result == 0) result = 10;

      sb.append(result).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}

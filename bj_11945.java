import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11945 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++) {
      String input = br.readLine();

      for (int j = M - 1; j >= 0; j--) {
        sb.append(input.charAt(j));
      }

      sb.append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}

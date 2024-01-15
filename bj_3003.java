import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_3003 {
  static int[] PIECE = { 1, 1, 2, 2, 2, 8 };
  static int[] result = { 0, 0, 0, 0, 0, 0 };
  static int len = PIECE.length;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());

    solution();

    br.close();
  }

  static void solution() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < len; i++) {
      int input = Integer.parseInt(st.nextToken());

      sb.append(PIECE[i] - input).append(" ");
    }

    System.out.println(sb.toString());
  }
}

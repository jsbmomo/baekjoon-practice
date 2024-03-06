import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10807 {

  static int N, V;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    inputs();
    solutions();
  }

  private static void solutions() {
    int count = 0;

    while(st.hasMoreTokens()) {
      if (Integer.parseInt(st.nextToken()) == V) count++;
    }

    System.out.println(count);
  }

  private static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(br.readLine());

    br.close();
  }
}

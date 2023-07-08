import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2702 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    
    int num = Integer.parseInt(br.readLine());

    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int result = gcd(a, b);

      sb.append(a * b / result).append(" ").append(result).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }

  private static int gcd(int a, int b) {
    if (a % b == 0) return b;

    return gcd(b, a % b);
  }
}

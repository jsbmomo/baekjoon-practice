import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5073 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while(true) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if ((a + b + c) == 0) break;

      if (!checkTriangle(a, b, c)) {
        sb.append("Invalid").append('\n');
        continue;
      }

      if ((a == b) && (b == c)) {
        sb.append("Equilateral").append('\n');
        continue;
      }
      
      if ((a == b) || (b == c) || (c == a)) {
        sb.append("Isosceles").append('\n');
        continue;
      }

      // if ((a != b) && (b != c) && (c != a))
      sb.append("Scalene").append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }

  static boolean checkTriangle(int a, int b, int c) {
    return ((a + b) <= c || (a + c) <= b || (b + c) <= a) ? false : true;
  }
}

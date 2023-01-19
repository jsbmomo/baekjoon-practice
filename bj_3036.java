import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_3036 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int first = Integer.parseInt(st.nextToken());

    for (int i = 1; i < count; i++) {
      int ring = Integer.parseInt(st.nextToken());

      int gcd = gcd(first, ring);

      System.out.println(String.format("%d/%d", (first / gcd), (ring / gcd)));
    }
  }

  static int gcd(int a, int b) {
    int temp;

    while (b != 0) {
      temp = a % b;
      a = b;
      b = temp;
    }

    return a;
  }
}

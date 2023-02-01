import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5032 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int e = Integer.parseInt(st.nextToken());
    int f = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int sum = e + f;
    int ans = 0;

    while (sum >= c) {
      int mok = sum / c;
      ans += mok;
      sum = mok + (sum % c);
    }

    System.out.println(ans);
    br.close();
  }
}

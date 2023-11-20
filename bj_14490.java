import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_14490 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String[] splited = br.readLine().split(":");

    final int N = Integer.parseInt(splited[0]);
    final int M = Integer.parseInt(splited[1]);
    
    int gcd = gcd(Math.max(N, M), Math.min(N, M));

    System.out.println(String.format("%d:%d", N / gcd, M / gcd));
    br.close();
  }

  static int gcd(int a, int b) {
    if (b == 0) return a;

    return gcd(b, a % b);
  }
}

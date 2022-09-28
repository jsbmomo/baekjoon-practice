import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11050 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    // System.out.println(binomialCoefficient(N K));
  }

  static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }

    return n * factorial(n - 1);
  }

  static int binomialCoefficient(int n, int k) {
    if (n == k || k == 0) {
      return 1;
    }

    return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
  }
}

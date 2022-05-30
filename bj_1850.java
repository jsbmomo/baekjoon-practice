import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1850 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");

    long num1 = Integer.parseInt(input[0]);
    long num2 = Integer.parseInt(input[1]);

    long gcd = getGcd(num1, num2);

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= gcd; i++) {
      sb.append("1");
    }

    System.out.println(sb.toString());
  }

  public static long getGcd(long a, long b) {
    while (b > 0) {
      long temp = a;
      a = b;
      b = temp % b;
    }
    return a;
  }
}

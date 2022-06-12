import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 0;

    while (input-- > 0) {
      int prime = Integer.parseInt(st.nextToken());
      boolean notPrime = false;

      if (prime <= 1) continue;

      for (int value = 2; value < prime; value++) {
        if ((prime % value) == 0) {
          notPrime = true;
          break;
        }
      }

      if (notPrime) continue;

      count++;
    }

    System.out.println(count);
  }
}

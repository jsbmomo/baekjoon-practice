import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2581 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    int sum = 0;
    int min = N;

    for (int i = M; i <= N; i++) {
      if (i < 2) continue;

      boolean isPrime = true;

      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        sum += i;
      }

      if (min > i && isPrime) {
        min = i;
      }
    }

    if (sum == 0) {
      System.out.println(-1);
      return ;
    }
    
    System.out.println(sum);
    System.out.println(min);
    br.close();
  }
}

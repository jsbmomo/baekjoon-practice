import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13909 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());
    boolean[] status = new boolean[number + 1];

    for (int i = 1; i <= number; i++) {
      for (int j = i; j <= number; j += i) {
        status[j] = !status[j];
      }
    }

    int result = 0;

    for (boolean s : status) {
      if (s) result++;
    }

    System.out.println(result);
    br.close();
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1769 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    int transform = 0;

    while (true) {
      long sum = 0;

      if (input.length() == 1) {
        break;
      }

      for (int i = 0; i < input.length(); i++) {
        sum += input.charAt(i) - '0';
      }

      transform++;

      input = String.valueOf(sum);
    }

    System.out.println(transform);
    System.out.println(Integer.parseInt(input) % 3 == 0 ? "YES" : "NO");
  }
}
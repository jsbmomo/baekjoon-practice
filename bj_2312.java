import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2312 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    while (testCase-- > 0) {
      int num = Integer.parseInt(br.readLine());

      for (int i = 2; i <= num; i++) {
        int count = 0;

        while (num % i == 0) {
          num /= i;
          count ++;
        }

        if (count != 0) sb.append(i).append(' ').append(count).append('\n');

        if (num == 0) break;
      }
    }

    System.out.println(sb.toString());
    br.close();
  }
}

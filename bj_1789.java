import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1789 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long num = Integer.parseInt(br.readLine());
    long sum = 0;

    int count = 0;

    for (int i = 1; ; i++) {
      if (sum > num) break;

      sum += i;
      count += 1;
    }

    System.out.println(count - 1);
    br.close();
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2193 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    long[] count = new long[input];

    count[0] = 0;
    count[1] = 1;

    for (int i = 2; i <= input; i++) {
      count[i] = count[i - 1] + count[i - 2];
    }

    System.out.println(count[input - 1]);

    br.close();
  }
}

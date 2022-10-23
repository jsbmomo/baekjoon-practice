import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_3049 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    /**
     *            n!
     * nC4 = -------------
     *        4! (n - 4)!
     */
    System.out.println((n * (n - 1) * (n - 2) * (n - 3)) / 24);
  }
}

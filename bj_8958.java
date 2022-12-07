import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_8958 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCase; i++) {
      int count = 0;
      int score = 0;

      for (char c : br.readLine().toCharArray()) {
        count = (c == 'O') ? count + 1 : 0;
        score += count;
      }

      System.out.println(score);
    }

    br.close();
  }
}

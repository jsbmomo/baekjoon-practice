import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10102 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int V = Integer.parseInt(br.readLine());
    String inputs = br.readLine();

    int countA = 0, countB = 0;

    for (int i = 0; i < inputs.length(); i++) {
      char c = inputs.charAt(i);

      if (c == 'A') countA++;
      if (c == 'B') countB++;
    }

    System.out.println(countA == countB ? "Tie" : countA > countB ? 'A' : 'B');
    br.close();
  }
}

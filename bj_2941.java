import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2941 {
  static String[] CROATIA = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    for (String word : CROATIA) {
      if (input.indexOf(word) >= 0) {
        input = input.replace(word, "A");
      }
    }

    System.out.println(input.length());
    br.close();
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_3059 {
  static boolean[] ALPHABET;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputs = Integer.parseInt(br.readLine());

    for (int i = 0; i < inputs; i++) {
      ALPHABET = new boolean[26];

      for (char c : br.readLine().toCharArray()) {
        ALPHABET[c - 65] = true;
      }

      int sumAscii = 0;
      for (int j = 0; j < ALPHABET.length; j++) {
        if (!ALPHABET[j]) {
          sumAscii += 65 + j;
        }
      }

      System.out.println(sumAscii);
    }

    br.close();
  }
}

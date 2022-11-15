import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10988 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] word = br.readLine().toCharArray();
    int len = word.length;
    boolean result = true;

    for (int i = 0; i < len / 2; i++) {
      if (word[i] != word[len - 1 - i]) {
        result = false;
        break;
      }
    }

    System.out.println(result ? 1 : 0);

    br.close();
  }
}

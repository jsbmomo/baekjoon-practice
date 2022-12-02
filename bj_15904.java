import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_15904 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    char[] ucpc = { 'U', 'C', 'P', 'C' };
    int index = 0;

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ucpc[index]) index++;

      if (index == 4) {
        System.out.println("I love UCPC");
        return;
      }
    }
    
    System.out.println("I hate UCPC");
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_12780 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input1 = br.readLine();
    String input2 = br.readLine();

    int count = 0;

    for (int i = 0; i < input1.length(); i++) {
      boolean no = false;
      for (int j = 0; j < input2.length(); j++) {
          if (i + j >= input1.length() || input1.charAt(i + j) != input2.charAt(j)) {
              no = true;
              break;
          }
      }
      if (!no) count++;
    }

    System.out.println(count);
    br.close();
  }
}
